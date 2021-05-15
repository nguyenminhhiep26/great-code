package BTAP_JDBC;

import java.sql.*;
import java.util.Scanner;

public class DrinkMy {
    public static void main(String[] args) {
        try(
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookshop","root","");
                Statement stmt = con.createStatement();
                ){
            boolean END = false;
            while (!END){
                System.out.println("1 - Thêm đồ  uống vào danh sách ");
                System.out.println("2 - Hiển thị danh sách ");
                System.out.println("3 - Update đồ uống");
                System.out.println("4 - Update giá đồ uống");
                System.out.println("5 - Delete đồ uống");
                System.out.println("6 - End...");
                System.out.println("-------------------------------");
                System.out.println("Mời bạn chọn : ");
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                sc.nextLine();
                switch (n){
                    case 1:
                    {
                        System.out.println("Nhập id đồ uống mới : ");
                        int id1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập tên đồ uống mới : ");
                        String name1 = sc.nextLine();
                        System.out.println("Nhập thương hiệu  : ");
                        String trademark1 = sc.nextLine();
                        System.out.println("Nhập nơi xuất khẩu :  ");
                        String imposts1 = sc.nextLine();
                        System.out.println("Nhập giá bán : ");
                        float price1 = Integer.parseInt(sc.nextLine());

                        String strSelect1 = "insert into drinks values ( ? , ? , ? , ?, ?)";
                        PreparedStatement ptstm1 = con.prepareStatement(strSelect1);
                        ptstm1.setInt(1,id1);
                        ptstm1.setString(2,name1);
                        ptstm1.setString(3,trademark1);
                        ptstm1.setString(4,imposts1);
                        ptstm1.setFloat(5,price1);

                        int rows = ptstm1.executeUpdate();
                        System.out.println(rows + "rows affected");
                        String check1 = "select * from drinks where Name = '" + name1 + "'";
                        ResultSet rset1 = stmt.executeQuery(check1);
                        ResultSetMetaData rsetMD1 = rset1.getMetaData();
                        int num = rsetMD1.getColumnCount();

                        for (int i = 1 ; i<=num ; i++){
                            System.out.printf("%-30s" , rsetMD1.getColumnName(i));
                        }
                        System.out.println();

                        for (int i = 1; i<=num ; i++ ){
                            System.out.printf("%-30s", "(" + rsetMD1.getColumnClassName(i) + ")");
                        }
                        System.out.println();

                        while (rset1.next()){
                            for (int i = 1 ; i <= num ; i++){
                                System.out.printf("%-30s" , rset1.getString(i));
                            }
                            System.out.println();
                        }
                        break;

                    }
                    case  2 :
                    {
                        ResultSet rset2 = stmt.executeQuery("select * from drinks");
                        ResultSetMetaData rsetMD2 = rset2.getMetaData();
                        int num2 = rsetMD2.getColumnCount();
                        for (int i = 1 ; i<= num2 ; i++){
                            System.out.printf("%-30s" , rsetMD2.getColumnName(i));
                        }
                        System.out.println();

                        for (int i = 1 ; i<= num2 ; i++){
                            System.out.printf("%-30s" , "(" + rsetMD2.getColumnClassName(i) + ")");
                        }
                        System.out.println();

                        while (rset2.next()){
                            for (int i = 1 ; i<= num2 ; i++){
                                System.out.printf("%-30s" , rset2.getString(i));
                            }
                            System.out.println();
                        }
                        break;
                    }

                    case 3:
                    {
                        System.out.println("Enter id : ");
                        int id2 = Integer.parseInt(sc.nextLine());
                        System.out.println("Name drinks : ");
                        String name2 = sc.nextLine();

                        String update = "UPDATE drinks set Name = '" + name2 + "' where id = " + id2 ;
                        Statement stmt3 = con.createStatement();
                        int update3 = stmt3.executeUpdate(update);
                        System.out.println("bạn đã sửa thành công tên đồ uống");

                        break;
                    }


                    case 4 :
                    {
                        System.out.println("Enter id : ");
                        int id4 = Integer.parseInt(sc.nextLine());
                        System.out.println("Price drinks : ");
                        int price4 = Integer.parseInt(sc.nextLine());

                        String update1 = "Update drinks set price '" + price4 + "' where id = " + id4;
                        Statement stmt4 = con.createStatement();
                        int update4 = stmt4.executeUpdate(update1);
                        System.out.println("bạn đã sửa giá tiền thành công" );

                        break;
                    }

                    case 5:
                    {
                        System.out.println("Enter id drinks of delete : ");
                        int id5 = Integer.parseInt(sc.nextLine());
                        String Delete = "Delete from drinks where id = '" + id5 + "'";
                        Statement stmt5 = con.createStatement();
                        int delete5 = stmt5.executeUpdate(Delete);
                        System.out.println("da xoa thanh cong ");

                        break;
                    }

                    case 6:
                    {
                        END = true;
                        System.out.println("END....");
                    }

                }
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
