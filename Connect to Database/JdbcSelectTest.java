package SQL_SELECT;

import java.sql.*;
import java.util.Scanner;

public class JdbcSelectTest {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                        "ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select id, title, price, qty from books";
            System.out.println("The SQL statement is " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are : ");
            int rowCount = 0;
            while (rset.next()){
                int id = rset.getInt("id");
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + " ," + title + " ," + price + " ," + qty);
                ++rowCount;
            }
            System.out.println("Total number of records= " + rowCount);
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
