package Practice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    List<Students> StudentList = new ArrayList<>();
    public  List<Students> loading(){
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
                Statement statement = connection.createStatement();
                ){
            String Loading = "Select * from student";
            ResultSet resultSet = statement.executeQuery(Loading);

            while (resultSet.next()){
                String StudentID = resultSet.getString("StudentID");
                String StudentName = resultSet.getString("StudentName");
                String Address = resultSet.getString("Address");
                String Phone = resultSet.getString("Phone");
                Students students = new Students(StudentID,StudentName,Address,Phone);
                StudentList.add(students);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return StudentList;
    }

    public void Save(){
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
                Statement statement = connection.createStatement();
        ){
            String select = "Select * from student";
            ResultSet resultSet = statement.executeQuery(select);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int num = resultSetMetaData.getColumnCount();

            for (int i = 1; i<= num ; i++){
                System.out.printf("%-30s",resultSetMetaData.getColumnName(i));
            }
            System.out.println();

            while (resultSet.next()){
                for (int i = 1 ; i<= num ; i++){
                    System.out.printf("%-30s",resultSet.getString(i));
                }
                System.out.println();
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }

    public boolean Add(Students students){
        try(
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
                Statement statement = connection.createStatement();
        ){
            String insert = "Insert into student(StudentID, StudentName, Address,Phone) values (" + students.getStudentID()+ ", '" + students.getStudentName()+ "','" + students.getAddress() +"','"+ students.getPhone()+"')";
            statement.executeUpdate(insert);
            loading();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return false;
    }

    public void printStudent(){
        System.out.println("Student List:" + StudentList);
        for (int i=0;i<this.StudentList.size();i++){
            System.out.println(i+1+"."+this.StudentList.get(i).getStudentID()+" , "+this.StudentList.get(i).getStudentName()+" , "+this.StudentList.get(i).getAddress()+" , "+this.StudentList.get(i).getPhone());
        }
    }


}
