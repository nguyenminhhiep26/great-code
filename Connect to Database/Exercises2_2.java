package SQL_SELECT;

import java.sql.*;
import java.util.Scanner;

public class Exercises2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Who do you want to find: ");
        String name = scan.nextLine();
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
                        "northwind?allowPublicRetrieval=true&useSLL=false&severTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
                ){
            String strSelect = "select * from customers \nWhere ContactName = '" + name + "';";
            System.out.println("The SQL statement is : " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                String CustomerID = rset.getString("CustomerID");
                String CompanyName = rset.getString("CompanyName");
                String ContactName = rset.getString("ContactName");
                String ContactTitle = rset.getString("ContactTitle");
                String Address = rset.getString("Address");
                String City = rset.getString("City");
                String Region = rset.getString("Region");
                String PostalCode = rset.getString("PostalCode");
                String Country = rset.getString("Country");
                String Phone = rset.getString("Phone");
                String Fax = rset.getString("Fax");
                System.out.println(CustomerID + " ," + CompanyName + " ," + ContactName + " ," + ContactTitle+ " ," +
                        Address + ", " + City + " ," + Region + " ," + PostalCode + " ," + Country + " ," + Phone + " ," + Fax);
            }

        }catch (SQLException h){
            h.printStackTrace();
        }
    }
}
