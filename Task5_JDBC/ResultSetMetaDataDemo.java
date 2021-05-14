package More_JDBC;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop", "root", "");
                Statement stmt = conn.createStatement();
                ){
            ResultSet rset = stmt.executeQuery("select * from books");
            ResultSetMetaData resultSetMetaData = rset.getMetaData();
            int numColumns  = resultSetMetaData.getColumnCount();

            for (int i = 1; i <= numColumns; i++){
                System.out.printf("%-30s", resultSetMetaData.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numColumns ; i++){
                System.out.printf("%-30s","(" + resultSetMetaData.getColumnClassName(i) +")" );
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1 ; i <= numColumns; ++i){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
