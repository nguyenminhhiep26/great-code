package Giftshop.giftcontroller;

import Giftshop.Giftmodel.Gift;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GiftController {

    List<Gift> GiftList = new ArrayList<>();
    public List<Gift> SelectGift(){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = con.createStatement();
                ){
            String select = "select * from gifts";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()){
                int id = rset.getInt("ID");
                String name = rset.getString("Name");
                float price = rset.getFloat("Price");
                int qty = rset.getInt("qty");
                 Gift obj = new Gift(id, name , price , qty);
                 GiftList.add(obj);

            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return GiftList;
    }
    public int updateGift(Gift gift){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = con.createStatement();
        ){
            String update = "Update gifts set name = '" + gift.getName() + "',price = '"+gift.getPrice()+ "',qty = '" + gift.getQty()+ "' where id =" + gift.getID();
          int i =  stmt.executeUpdate(update);
            SelectGift();
            if (i == 0){
                return 0;
            }
            else {
                return 1;
            }
        }catch (SQLException ex){
            ex.printStackTrace();

        }
        return -1;
    }

    public  boolean insertGift(Gift gift){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = con.createStatement();
        ){
            String insert = "insert into gifts(id , name, price , qty) values (" + gift.getID() +" ,'" + gift.getName() + "' , '" + gift.getPrice() + "' ,'" + gift.getQty() +"')";
            stmt.executeUpdate(insert);
            SelectGift();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    public  boolean deleteGift(Gift gift){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = con.createStatement();
        ){
            String slect2 = "select * from gifts ";
            ResultSet rset = stmt.executeQuery(slect2);
            SelectGift();
            if (rset.next()){
                String delete = "delete from gifts where ID = '" + gift.getID() +"'";
                Statement stmt1 = con.createStatement();
                stmt1.executeUpdate(delete);
                System.out.println("đã xóa");
                return true;


            } else {
                System.out.println("id này k có trong gifts");
                return false;
            }

        }catch (SQLException ex){
            System.out.println("Cannot delete gift");
            ex.printStackTrace();

        }
        return false;
    }

    public  void  Display(){
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = con.createStatement();
        ){
            String strSelect = "select * from gifts";

            ResultSet rset = stmt.executeQuery(strSelect);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int count = rsetMD.getColumnCount();

            for (int i = 1; i <= count ; i++){
                System.out.printf("%-30s" , rsetMD.getColumnName(i));
            }
            System.out.println("");

            while (rset.next()){
                for (int i = 1 ; i <= count ; i++){
                    System.out.printf("%-30s" , rset.getString(i));
                }
                System.out.println("");
            }

        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

}
