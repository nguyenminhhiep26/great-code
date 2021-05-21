package Baithi3;

import java.sql.*;
import java.util.Scanner;

public class MainStudent {
    private static Scanner scanner = new Scanner(System.in);
    public  static  StudentList students = new StudentList("B123456");
    public static void main(String[] args) {
        boolean quite = false;
        printAction();
        while (!quite){
            System.out.println("\n Enter action: (4 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    students.printStudentList();
                    break;
                case 3:
                    students.save();
                    break;
                case 4:
                    System.out.println("\n Exit down .. ");
                    quite = true;
                    break;
            }
        }
    }
    private static void addNewStudent() {
        System.out.println("Enter Student ID: ");
        String id1 = scanner.nextLine();
        System.out.println("Enter Student Name: ");
        String name1 = scanner.nextLine();
        System.out.println("Enter Student Address: ");
        String address1 = scanner.nextLine();
        System.out.println("Enter Student PhoneNumber: ");
        String phoneNumber1 = scanner.nextLine();
        Students newStudent = Students.createStudent(id1,name1,address1,phoneNumber1);
        if(students.addNewStudent(newStudent)) {
            System.out.println("New Student Added: ID = "+ id1 + " , Name" + name1+
                    ", Address = "+address1+", Phone = "+phoneNumber1);
        }else {
            System.out.println("Can't add, " + name1 +" already on file");
        }
    }

    private static void printAction() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println(
                "1 - Add student records\n"+
                        "2 - Display student records\n"+
                        "3 - Save student records\n"+
                        "4 - Exit\n");
        System.out.println("Choose Your Action: ");
    }
}