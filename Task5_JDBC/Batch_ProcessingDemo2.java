package More_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ProcessingDemo2 {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                PreparedStatement pstmt = conn.prepareStatement("insert into books values (?, ? , ?, ? , ?)");
                ){
            conn.setAutoCommit(false);
            pstmt.setInt(1,1313);
            pstmt.setString(2,"Javacrip 1");
            pstmt.setString(3,"NGUYEN XUAN HY");
            pstmt.setDouble(4,14.11);
            pstmt.setInt(5,34);
            pstmt.addBatch();

            pstmt.setInt(1,1314);
            pstmt.setString(2,"Javacrip 2");
            pstmt.setString(3,"NGUYEN VAN HANH");
            pstmt.setDouble(4,15.12);
            pstmt.setInt(5,35);
            pstmt.addBatch();

            int[] returnCodes = pstmt.executeBatch();
            System.out.println("return codes are : ");
            for (int code : returnCodes){
                System.out.println(code + " ,");
            }
            System.out.println();
            conn.commit();
        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }

    }
}
