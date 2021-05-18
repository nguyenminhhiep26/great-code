package eBookShop.View;

import eBookShop.Controllers.*;
import eBookShop.Models.*;
import eBookShop.Controllers.*;

import java.sql.*;
import java.util.*;


public class CustomerView {
    Scanner input = new Scanner(System.in);
    public  String slt;
    public  ResultSet rst;
    BookShop bookShop = new BookShop();

    public  void customerManagement(User user) {
        int choice;
        do {
            System.out.println("1. Add new customer\n" +
                    "2. Update customer \n" +
                    "3. Delete customer\n" +
                    "4. Display all Customers\n" +
                    "5. Display all Users\n" +
                    "6. Back");
            System.out.println("Your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addCus();
                    break;
                case 2:
                    updateCus();
                    break;
                case 3:
                    deleteCus();
                    break;
                case 4:
                    CustomerController cus = new CustomerController();
                    cus.displayCustomer();
                    break;
                case 5:
                    Register reg = new Register();
                    reg.displayUser();
                    break;
                case 6:
                    bookShop.menuAdmin(user);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 6);
    }

    public  void addCus() {
        System.out.println("Enter customer ID:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter customer name: ");
        String name = input.nextLine();
        System.out.println("Enter customer address: ");
        String address = input.nextLine();
        System.out.println("Enter customer email: ");
        String email = input.nextLine();
        System.out.println("Enter customer phone: ");
        String phone = input.nextLine();
        System.out.println("Enter type of member:(1-Diamond,2-Gold,3-Silver,4-New)");
        int member = Integer.parseInt(input.nextLine());
        Customer obj = new Customer(id, name, address, email, phone, member);
        CustomerController ctrl = new CustomerController();
        ctrl.insertCustomer(obj);
    }

    public void updateCus() {
        Customer obj = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id you want to update:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter new address: ");
        String address = input.nextLine();
        System.out.println("Enter new email: ");
        String email = input.nextLine();
        System.out.println("Enter new phone: ");
        String phone = input.nextLine();
        obj.setAddress(address);
        obj.setCustomerID(id);
        obj.setEmail(email);
        obj.setPhone(phone);
        CustomerController ctr = new CustomerController();
        if (ctr.updateCustomer(obj) == 0) {
            System.out.println("No customer found");
        } else if (ctr.updateCustomer(obj) == 1) {
            System.out.println("Customer has been updated");
        }
    }

    public void deleteCus() {
        Customer obj = new Customer();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the customer id you want to delete:");
        int id = Integer.parseInt(input.nextLine());
        obj.setCustomerID(id);
        CustomerController ctr = new CustomerController();
        ctr.deleteCustomer(obj);
    }
    public  void cusInfor(User user) {
        int x = user.getId();
        CustomerController cus = new CustomerController();
        cus.display1Customer(x);
    }

    public  void cusOrder(User user) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            int x = user.getId();
            String select = "Select * from orders where customerID = " + x;
            ResultSet rset = stmt.executeQuery(select);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; i++) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public  void cusOrderDetail(User user) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            int x = user.getId();
            String select = "Select orderdetail.orderID,bookID,title,amount,price,orders.orderdate,orders.status  from orderdetail inner join orders on orderdetail.orderID = orders.orderID" +
                    " inner join customers on customers.customerID = orders.customerID where customers.customerID = " + x;
            ResultSet rset = stmt.executeQuery(select);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColumns = rsetMD.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            while (rset.next()) {
                for (int i = 1; i <= numColumns; i++) {
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}