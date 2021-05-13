package SQL_SELECT;

import java.sql.*;

public class Exercises1_1 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
                        "ebookshop?allowPublicRetrieval=true&useSLL=false&severTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
                ){
            String strSelect = "select id , title, author , price, qty from books ";
            System.out.println("the SQL statement is : " + strSelect + " \n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + " ," + title + ", " + author + " ," + price + " ," + qty);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
