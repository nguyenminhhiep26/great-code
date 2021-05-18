package eBookShop.View;

import eBookShop.Models.*;
import eBookShop.Controllers.*;

import java.sql.*;
import java.util.*;


public class OrderView {
    Scanner scanner = new Scanner(System.in);
    public static String slt;
    public static ResultSet rst;

    public static void displayOrderByStatus(int stt) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            switch (stt) {
                case 0:
                    System.out.println("Canceled Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                case 1:
                    System.out.println("Confirmed Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                case 2:
                    System.out.println("Pending Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                case 3:
                    System.out.println("Ready Order(s) \n" +
                            "===========================================================================================================================");
                    break;
                case 4:
                    System.out.println("Delivering Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                case 5:
                    System.out.println("Delivered Order(s)\n" +
                            "===========================================================================================================================");
                    break;
                default:
                    break;
            }
            System.out.println("orderID\t\tcustomerID\t\tdiscount\t\ttotal\t\torderdate\t\tstatus");
            slt = "Select orderID,customerID,discount,total,orderdate,status from orders where status = " + stt;
            rst = stmt.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("orderID");
                int cusID = rst.getInt("customerID");
                int discount = rst.getInt("discount");
                double total = rst.getDouble("total");
                String orderdate = rst.getString("orderdate");
                int status = rst.getInt("status");
                System.out.printf("%-6d\t\t%-8d\t\t%-8d\t\t%-6.1f\t\t%-12s\t%-6d\n", id, cusID, discount, total, orderdate, status);
            }
            System.out.println("===========================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void displayOrderByCustomerID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer ID: ");
        int cusid = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            System.out.println("==================================================================================================");
            System.out.println("orderID\t\tcustomerID\t\tdiscount\t\ttotal\t\torderdate\t\tstatus");
            slt = "Select orderID,customerID,discount,total,orderdate,status from orders where customerID =" + cusid;
            rst = stmt.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("orderID");
                int cusID = rst.getInt("customerID");
                int discount = rst.getInt("discount");
                double total = rst.getDouble("total");
                String orderdate = rst.getString("orderdate");
                int status = rst.getInt("status");
                System.out.printf("%-6d\t\t%-8d\t\t%-8d\t\t%-6.1f\t\t%-12s\t%-6d\n", id, cusID, discount, total, orderdate, status);
            }
            System.out.println("**Status: 0-Canceled, 1-Confirmed, 2-Pending,3-Ready,4-Delivering,5-Delivered");
            System.out.println("==================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void displayOrderByOrderID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Order ID: ");
        int orid = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            System.out.println("=========================================================================================================");
            System.out.println("orderID\t\tcustomerID\t\tdiscount\t\ttotal\t\torderdate\t\tstatus");
            slt = "Select * from orders where orderID =" + orid;
            rst = stmt.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("orderID");
                int cusID = rst.getInt("customerID");
                int discount = rst.getInt("discount");
                double total = rst.getDouble("total");
                String orderdate = rst.getString("orderdate");
                int status = rst.getInt("status");
                System.out.printf("%-6d\t\t%-8d\t\t%-8d\t\t%-6.1f\t\t%-12s\t%-6d\n", id, cusID, discount, total, orderdate, status);
                switch (status) {
                    case 0:
                        System.out.println("Canceled Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 1:
                        System.out.println("Confirmed Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 2:
                        System.out.println("Pending Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 3:
                        System.out.println("Ready Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 4:
                        System.out.println("Delivering Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    case 5:
                        System.out.println("Delivered Order(s)");
                        System.out.println("=========================================================================================================");
                        break;
                    default:
                        break;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void OrderDetailByOrderID() {
        System.out.println("Enter Order ID: ");
        Scanner scanner = new Scanner(System.in);
        int orid = scanner.nextInt();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore", "root", "");
             Statement stmt = conn.createStatement()) {
            System.out.println("===========================================================================================================================");
            System.out.println("orderID\t\toderdate\t\tbookID\t\ttitle\t\t\t\tprice\t\tamount");
            slt = "Select orders.orderID,orderdate,bookID,title,price,amount from orders inner join orderdetail on orders.orderID = orderdetail.orderID where orders.orderID =" + orid;
            rst = stmt.executeQuery(slt);
            while (rst.next()) {
                int id = rst.getInt("orderID");
                String date = rst.getString("orderdate");
                int bookid = rst.getInt("bookID");
                String title = rst.getString("title");
                double price = rst.getDouble("price");
                int amount = rst.getInt("amount");
                System.out.printf("%-6d\t\t%-12s\t%-8d\t%-12s\t\t%-6.1f\t\t%-6d\n", id, date, bookid, title, price, amount);
            }
            System.out.println("===========================================================================================================================");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}