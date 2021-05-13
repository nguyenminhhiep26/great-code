package SQL_SELECT;

import task8.java.C;

import java.sql.*;

public class Exercises1_2 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
                        "ebookshop?allowPublicRetrieval=true&useSSL=false&severTimezone=UTC",
                        "root","");
                Statement stmt = conn.createStatement();

                ){
            String check = "NGUYEN MINH HIEP";
            String strSelect = "select title , price , qty from books where author = '" + check +"';";
            System.out.println("The SQL statement is : " + strSelect + " \n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(title + " ," + price + " ," + qty);
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
