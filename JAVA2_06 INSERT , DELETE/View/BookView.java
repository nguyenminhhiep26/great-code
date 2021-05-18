package eBookShop.View;

import eBookShop.Models.*;
import eBookShop.Controllers.*;

import java.sql.*;
import java.util.*;


public class BookView {
    Scanner scanner = new Scanner(System.in);
    public static String slt;
    public static ResultSet rst;
    OrderView orderView = new OrderView();
    BookShop bookShop = new BookShop();

    public  void top10newest() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "SELECT * FROM books order by years limit 10";
            rst = stmt.executeQuery(slt);
            System.out.println("THE 10 NEWEST BOOKS:");
            System.out.println("=============================================================================================================");
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String years = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\n", id, title, author, years, genre, status, qty, price);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**");
            System.out.println("=============================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public  void topSeller() {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "select books.bookID,books.title,author,years,genre,books.status,qty,books.price,sum(orderdetail.amount) as soldamount from books inner join orderdetail on books.bookID = orderdetail.bookID inner join orders on orders.orderID = orderdetail.orderID" +
                    " where orders.status != 0 group by books.bookID,books.title,author,years,genre,books.status,qty,books.price order by soldamount DESC limit 10";
            rst = stmt.executeQuery(slt);
            System.out.println("TOP 10 SELLER:\n" +
                    "====================================================================================================================================");
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice\tsoldamount");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String year = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                int soldamount = rst.getInt("soldamount");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\t\t%-6d\n", id, title, author, year, genre, status, qty, price, soldamount);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**\n" +
                    "====================================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public  void orderDetail() {
        int choice;
        do {
            System.out.println("1. New confirmed order\n" +
                    "2. Display order by Customer ID\n" +
                    "3. Display order by order ID\n" +
                    "4. Display order detail by order ID\n" +
                    "5. Display pending order\n" +
                    "6. Display ready order\n" +
                    "7. Display delivering order\n" +
                    "8. Display delivered order\n" +
                    "9. Display canceled order\n" +
                    "0. Exit");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Back to menu. Please wait...");
                    break;
                case 1:
                    orderView.displayOrderByStatus(1);
                    break;
                case 2:
                    orderView.displayOrderByCustomerID();
                    break;
                case 3:
                    orderView.displayOrderByOrderID();
                    break;
                case 4:
                    orderView.OrderDetailByOrderID();
                    break;
                case 5:
                    orderView.displayOrderByStatus(2);
                    break;
                case 6:
                    orderView.displayOrderByStatus(3);
                    break;
                case 7:
                    orderView.displayOrderByStatus(4);
                    break;
                case 8:
                    orderView.displayOrderByStatus(5);
                    break;
                case 9:
                    orderView.displayOrderByStatus(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 0);
    }

    public  void findBookByCategory() {
        System.out.println("Enter the category: (1-Fiction,2-Science,3-Literature)");
        int cat = scanner.nextInt();
        System.out.println("===========================================================================================================================");
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "SELECT bookID,title,author,years,books.genre,status,qty,price FROM books inner join category on category.genre = books.genre where books.genre =" + cat;
            rst = stmt.executeQuery(slt);
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String years = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\n", id, title, author, years, genre, status, qty, price);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**");
            System.out.println("===========================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public  void findBookByAuthor() {
        System.out.println("Enter author's name:");
        String authors = scanner.nextLine();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "SELECT bookID,title,author,years,books.genre,status,qty,price FROM books where author like \'%" + authors + "%\'";
            rst = stmt.executeQuery(slt);
            System.out.println("===============================================================================================================================");
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String years = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\n", id, title, author, years, genre, status, qty, price);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**\n" +
                    "===============================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public  void findBookByID() {
        System.out.println("Enter book's ID:");
        int bookid = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            slt = "SELECT bookID,title,author,years,books.genre,status,qty,price FROM books where bookID = " + bookid;
            rst = stmt.executeQuery(slt);
            System.out.println("====================================================================================================================================");
            System.out.println("bookID\t\t\ttitle\t\t\t\t\t\tauthor\t\t\t\t\t\tyears\t\t\tgenre\t\tstatus\t\tqty\t\tprice");
            while (rst.next()) {
                int id = rst.getInt("bookID");
                String title = rst.getString("title");
                String author = rst.getString("author");
                String years = rst.getString("years");
                int genre = rst.getInt("genre");
                int status = rst.getInt("status");
                int qty = rst.getInt("qty");
                double price = rst.getDouble("price");
                System.out.printf("%-8d\t\t%-20s\t\t%-20s\t\t%-10s\t\t%-6d\t\t%-6d\t\t%-6d\t%-6.1f\n", id, title, author, years, genre, status, qty, price);
            }
            System.out.println("**Status: 1-Out of stock, 2-available, 3-available soon**\n" +
                    "====================================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public  void bookManagement(User user) {
        int choice;
        do {
            System.out.println("1. Add new book\n" +
                    "2. Update book\n" +
                    "3. Delete book\n" +
                    "4. Display order by status\n" +
                    "5. Display order by customer id\n" +
                    "6. Display order by order id\n" +
                    "7. Order detail by order id\n" +
                    "8. Display all books\n" +
                    "9. Back");
            System.out.println("Your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addBk();
                    break;
                case 2:
                    updateBk();
                    break;
                case 3:
                    deleteBk();
                    break;
                case 4:
                    System.out.println("Enter status: ");
                    int x = scanner.nextInt();
                    orderView.displayOrderByStatus(x);
                case 5:
                    orderView.displayOrderByCustomerID();
                    break;
                case 6:
                    orderView.displayOrderByOrderID();
                    break;
                case 7:
                    orderView.OrderDetailByOrderID();
                    break;
                case 8:
                    BookController ctr = new BookController();
                    ctr.displayBook();
                    break;
                case 9:
                    bookShop.menuAdmin(user);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 9);
    }

    public  void addBk() {
        System.out.println("Enter Book ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter book title: ");
        String title = scanner.nextLine();
        System.out.println("Enter book's author: ");
        String author = scanner.nextLine();
        System.out.println("Enter book's quantity: ");
        int qty = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter book price: ");
        double price = scanner.nextDouble();
        Book obj = new Book(id, title, author, price, qty);
        BookController ctrl = new BookController();
        ctrl.insertBook(obj);
    }

    public void updateBk() {
        Book obj = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the book id you want to update:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter new qty: ");
        int qty = Integer.parseInt(input.nextLine());
        System.out.println("Enter new price: ");
        double price = input.nextDouble();
        System.out.println();
        obj.setBookID(id);
        obj.setPrice(price);
        obj.setQty(qty);
        BookController ctr = new BookController();
        if (ctr.updateBook(obj) == 0) {
            System.out.println("Wrong book's information");
        } else if (ctr.updateBook(obj) == 1) {
            System.out.println("Book has been updated");
        }
    }

    public  void deleteBk() {
        Book obj = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id you want to delete:");
        int id = Integer.parseInt(input.nextLine());
        obj.setBookID(id);
        BookController ctr = new BookController();
        ctr.deleteBook(obj);
    }



}