package More_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Batch_ProcessingDemo  {
    public static void main(String[] args)  {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = conn.createStatement();
                ){
            conn.setAutoCommit(false);
            stmt.addBatch("insert into books values (1501, 'JAVA ABC','CHU DUC LONG',99.99,99)");
            stmt.addBatch("insert into books values (1502,'PHP 1','DO QUNG TRUNG',18.19,91)");
            stmt.addBatch("insert into books values (1503,'PYTHON 1', 'BAC HO',17.18,81)");
            stmt.addBatch("insert into books values (1504,'C12','NGUYEN XUAN HAU',16.17,71)");
            stmt.addBatch("update books set price = 11.11 where id = 1101 or id = 1102");
            int[] returnCodes = stmt.executeBatch();

            System.out.println("Return codes are : ");
            for (int code : returnCodes){
                System.out.println(code + " ,");
            }
            System.out.println();
            conn.commit();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
