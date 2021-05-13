package SQL_SELECT;

import java.sql.*;

public class Exercises1_3 {
    public static void main(String[] args) {
     try(
             Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
             +"ebookshop?allowPublicRetrieval=true&useSLL=false&severTimezone=UTC",
                     "root","");
             Statement stmt = conn.createStatement();
             ){
         String check = "NGUYEN MINH HIEP";
         double check1 = 30;
         String strSelect = "select title ,author, price, qty from books where author = '"
                 + check + "' \nOR price >= '" + check1 + "'\nORDER BY price DESC , id ASC;";
         System.out.println("the SQL statement is : " + strSelect + "\n");
         ResultSet rset = stmt.executeQuery(strSelect);
         while (rset.next()){
             String title = rset.getString("title");
             String author = rset.getString("author");
             double price = rset.getDouble("price");
             int qty = rset.getInt("qty");
             System.out.println(title + " ," + author + " ," + price + " ," + qty);
         }
     }catch (SQLException e){
         e.printStackTrace();
     }
    }
}
