package eBookShop.View;

import eBookShop.Controllers.BookController;
import eBookShop.Controllers.CartController;
import eBookShop.Controllers.CustomerController;
import eBookShop.Models.Book;
import eBookShop.Models.Cart;
import eBookShop.Models.Checkout;
import eBookShop.Models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CartView {
    public static String slt;
    public static ResultSet rst;
    Scanner scanner = new Scanner(System.in);
    BookShop bookShop = new BookShop();

    String url = "jdbc:mysql://192.168.64.3:3306/ebookstore";
    String username = "root";
    String password = "";


    public List<Cart> addToCart(User user) {
        List<Cart> items = new ArrayList<>();
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        char choice = 0;
        do {
            System.out.println("Proceed/Continue purchasing book? (Y/N)");
            choice = scanner.nextLine().charAt(0);
            switch (choice) {
                case 'y':
                    System.out.println("Enter book ID you want to buy: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    book.setBookID(id);
                    System.out.println("Enter amount you want to buy: ");
                    int qty = Integer.parseInt(scanner.nextLine());
                    book.setQty(qty);
                    CartController obj = new CartController();
                    Cart item = obj.getItem(book);
                    if (item == null) {
                        break;
                    } else {
                        items.add(item);
                        System.out.println(item);
                        break;
                    }
                case 'n':
                    if (items.size() == 0) {
                        System.out.println("Thank you");
                    } else {
                        do {
                            System.out.println("Go to checkout? (Y/N):");
                            choice = scanner.nextLine().charAt(0);
                            switch (choice) {
                                case 'y':
                                    previewOrder(items, user);
                                    break;
                                case 'n':
                                    System.out.println("Thanks!");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                        } while (choice == 'n' || choice == 'y');
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 'n');
        return items;
    }

    public Checkout checkout(List<Cart> list, User user) {
        Scanner scanner = new Scanner(System.in);
        CustomerController cusCtrl = new CustomerController();
        int check = 0;
        String email = null;
        do {
            System.out.println("Enter your email:");
            email = scanner.nextLine();
            check = cusCtrl.checkEmail(email);
        } while (check != 0);

        System.out.println("Choose payment method:\n" +
                "1. COD\n" +
                "2. Visa Master/Visa Credit");
        int x = Integer.parseInt(scanner.nextLine());
        String payment = null;
        if (x == 1) {
            payment = "COD";
        } else if (x == 2) {
            payment = "Visa Master/Visa Credit";
        }
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        BookController ctr = new BookController();
        ctr.afterPurchase(list, user);
        Checkout checks = new Checkout(user, email, payment, address);
        return checks;
    }

    public void previewOrder(List<Cart> list, User user) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement()) {
            Checkout checks = checkout(list, user);
            System.out.println("Confirm you order:");
            System.out.printf("%-30s%-30s%-30s%-30s\n", "ID", "Email", "Payment", "Address");
            System.out.println(checks);
            System.out.println("============================================================================================");
            slt = "Select * from orders where customerID =" + user.getId() + " AND orderdate = CURRENT_DATE()";
            rst = stmt.executeQuery(slt);
            ResultSetMetaData rset = rst.getMetaData();
            int column = rset.getColumnCount();
            for (int i = 1; i <= column; i++) {
                System.out.printf("%-30s", rset.getColumnName(i));
            }
            System.out.println();
            while (rst.next()) {
                for (int i = 1; i <= column; i++) {
                    System.out.printf("%-30s", rst.getString(i));
                }
                System.out.println();
            }
            System.out.println("**Status: 0-Canceled, 1-Confirmed, 2-Pending,3-Ready,4-Delivering,5-Delivered");
            System.out.println("============================================================================================");

            slt = "Select orderdetail.orderID,bookID,title,amount,price,orderdetail.createddate,orderdetail.updateddate from orderdetail inner join orders on orderdetail.orderID = orders.orderID where orders.customerID =" + user.getId() + " AND orders.orderdate = CURRENT_DATE()";
            rst = stmt.executeQuery(slt);
            rset = rst.getMetaData();
            column = rset.getColumnCount();
            for (int i = 1; i <= column; i++) {
                System.out.printf("%-30s", rset.getColumnName(i));
            }
            System.out.println();
            while (rst.next()) {
                for (int i = 1; i <= column; i++) {
                    System.out.printf("%-30s", rst.getString(i));
                }
                System.out.println();
            }
            bookShop.menuCustomer(user);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}