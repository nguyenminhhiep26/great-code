package More_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Catch_Clause {
    public static void main(String[] args) throws  SQLException{
     try(
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root", "");
             Statement st =con.createStatement();
             ){
         try {
             con.setAutoCommit(false);
             st.executeUpdate("insert into books values (2012,'JAVAS','TRUNG KIEN',12.12,7)");
             con.commit();
         }catch (SQLException ex){
             System.out.println("kien");
             con.rollback();
             ex.printStackTrace();
         }
     }

    }
}
