package SQL_SELECT;

import java.sql.*;

public class Exercises2_3 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
                                "northwind?allowPublicRetrieval=true&useSLL=false&severTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();
                ){
            String strSelect  = "select ProductName from products";
            System.out.println("The SQL statement is " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                String ProductName = rset.getString("ProductName");
                System.out.println(ProductName);

            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
