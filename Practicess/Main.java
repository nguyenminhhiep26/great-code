package Practice;

import task8.java.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement STM = new StudentManagement();
        boolean Exit = false;
        while (!Exit){
            System.out.println("1 - Add student records");
            System.out.println("2 - Display student records");
            System.out.println("3 - Save");
            System.out.println("4 - Exit");
            System.out.println("_______________________________");
            System.out.println("Your choice : ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                {
                    System.out.println("new StudentID : ");
                    String ID1 = scanner.nextLine();
                    System.out.println("new StudentName :  ");
                    String Name1 = scanner.nextLine();
                    System.out.println("Address : ");
                    String Add1 = scanner.nextLine();
                    System.out.println("Phone : ");
                    String Phone1 = scanner.nextLine();

                    STM.Add(new Students(ID1,Name1,Add1,Phone1));
                    break;
                }

                case 2:
                {
                        STM.printStudent();
                        break;
                }

                case 3:
                {
                    STM.Save();
                    break;
                }

                case 4:
                {
                    Exit = true;
                    System.out.println("Exit!!!!");
                }
            }
        }
    }
}
