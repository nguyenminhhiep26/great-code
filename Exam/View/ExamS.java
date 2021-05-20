package Exams.View;

import Exams.Controller.UserController;
import Exams.Model.USER;

import java.util.Scanner;

public class ExamS {
    public static void main(String[] args) {
        System.out.println("Welcome to Exam : ");
        System.out.println("_______________________________________");
        login();

    }
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1 - Sign in ");
            System.out.println("2 - Sign up");
            System.out.println("3 - Select ");
            System.out.println("4 - Exist");
            System.out.println("______________________________");
            System.out.println("Your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    UserController userController = new UserController();
                    USER lg = userController.signIn();
                    System.out.println("Do you want");
                    break;

                case 2:
                    System.out.println("new ID : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("new name : ");
                    String name = scanner.nextLine();
                    System.out.println("pass : ");
                    String pass = scanner.nextLine();
                    System.out.println("role : ");
                    int role = Integer.parseInt(scanner.nextLine());

                    UserController us = new UserController();
                    us.signUp(new USER(id,name,pass,role));
                    break;

                case 3:
                    UserController sle = new UserController();
                    sle.displayUser();
                    break;

            }
        }while (choice!=4);
    }
}
