package More_JDBC;

import java.sql.*;

public class JdbcPreparedStatementTest {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                PreparedStatement pstmt = conn.prepareStatement(
                        "insert into books values ( ?, ? , ? , ? , ?)"
                );
                PreparedStatement pstmtSelect = conn.prepareStatement("select * from books");
                ){
            pstmt.setInt(1,7003);
            pstmt.setString(2,"NGUYEN THI HIEN");
            pstmt.setString(3,"C" );
            pstmt.setDouble(4,77.99);
            pstmt.setInt(5,78);
            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + "rows affected");

            pstmt.setInt(1,7004);
            pstmt.setString(2,"NGUYEN VAN HUY");
            pstmt.setString(3,"IJ");
            pstmt.setDouble(4,88.66);
            pstmt.setInt(5,46);
            rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + "rows affected");

            ResultSet rset = pstmtSelect.executeQuery();
            while (rset.next()){
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                double price = rset.getDouble("price");
                int qty = rset.getInt("qty");
                System.out.println(id + " ," + title + " ," + author + " ," + price + " ," + qty);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
