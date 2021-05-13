package SQL_SELECT;

import java.sql.*;
import java.util.Collections;

public class Exercises2_1 {


    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
                        "northwind?allowPublicRetrieval=true&useSLL=false&severTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();

                ){
            String trSelect = "select * from customers ";
            System.out.println("The SQL statement is " + trSelect + " \n");
            ResultSet rset = stmt.executeQuery(trSelect);

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
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
