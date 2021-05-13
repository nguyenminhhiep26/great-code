package SQL_SELECT;

import java.sql.*;
import java.util.Scanner;

public class Exercises2_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the min price : ");
        float min  = scan.nextFloat();
        System.out.println("Enter the max price : ");
        float max = scan.nextFloat();
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+
                        "northwind?allowPublicRetrieval=true&useSLL=false&severTimezone=UTC","root","");
                Statement stmt = conn.createStatement();
                ){
            String strSelect = "select ProductName from products \n where " + min+ "< UnitPrice || UnitPrice < " + max + ";";
            System.out.println("The SQL statement is " + strSelect +"\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                String ProductName = rset.getString("ProductName");
                System.out.println(ProductName);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
