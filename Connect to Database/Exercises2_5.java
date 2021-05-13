package SQL_SELECT;

import java.sql.*;

public class Exercises2_5 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
                        "northwind?allowPublicRetrieval=true&useSLL=false&severTimezone=UTC","root","");
                Statement stmt = conn.createStatement();
                ){
            String strSelect ="select * from products";
            System.out.println("The SQL statement is  " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                int ProductID = rset.getInt("ProductID");
                String ProductName = rset.getString("ProductName");
                int SupplierID = rset.getInt("SupplierID");
                int CategoryID = rset.getInt("CategoryID");
                String QuantityPerUnit = rset.getString("QuantityPerUnit");
                float UnitPrice = rset.getFloat("UnitPrice");
                int UnitsInStock = rset.getInt("UnitsInStock");
                int UnitsOnOrder = rset.getInt("UnitsOnOrder");
                int ReorderLevel = rset.getInt("ReorderLevel");
                int Discontinued = rset.getInt("Discontinued");

                System.out.println(ProductID + " - " + ProductName + " - " + SupplierID + " -" +
                       CategoryID +" - " +QuantityPerUnit + " - "+ UnitPrice + " - " +UnitsInStock + " -"+
                        UnitsOnOrder + " - " + ReorderLevel + " - " + Discontinued);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
