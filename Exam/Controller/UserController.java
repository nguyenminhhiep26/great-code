package Exams.Controller;

import Exams.Model.USER;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserController {
    List<USER> USERList = new ArrayList<>();
    public List<USER>  loading(){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exams", "root","");
                Statement stmt = con.createStatement();
                ){
            String select1 = "Select * from exams";
            ResultSet rset = stmt.executeQuery(select1);
            while (rset.next()){
                int userID = rset.getInt("userID");
                String name = rset.getString("name");
                String pass = rset.getString("pass");
                int role = rset.getInt("role");

                USER job = new USER(userID,name,pass,role);
                USERList.add(job);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return USERList;
    }



    public boolean signUp(USER user){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exams", "root","");
                Statement stmt = con.createStatement();
        ){
            String signUp = "insert into users (userID, name, pass, role) values ( '" + user.getId() + "','" + user.getName()+"','" + user.getPassword() + "','" + user.getRole() +"')";
            stmt.executeUpdate(signUp);
            loading();
            System.out.println("Signup successfully");
            return true;
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }



    public USER signIn(){
        USER obj = new USER();
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exams", "root","");
                Statement stmt = con.createStatement();
        ){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your username : ");
            String name = sc.nextLine();
            System.out.println("Enter your password : ");
            String pass = sc.nextLine();

            String select = "Select * from users where name = '" + name + "'and  pass = '" + pass + "'" ;
            ResultSet rest = stmt.executeQuery(select);
            while (rest.next()){
                int userID = rest.getInt("userID");
                String name1 = rest.getString("name");
                String pass2 = rest.getString("pass");
                int role = rest.getInt("role");
                obj = new USER(userID,name,pass,role);
            }
            System.out.println("Sign in successfully");
        }catch (SQLException ex){
            ex.printStackTrace();

        }
        return obj;
    }

    public void displayUser(){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/exams", "root","");
                Statement stmt = con.createStatement();
        ){
            String display = "Select * from users";
            ResultSet rset = stmt.executeQuery(display);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int num = rsetMD.getColumnCount();
            for (int i = 1; i<= num; i++){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();

            while (rset.next()){
                for (int i= 1; i<=num; i++){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}
