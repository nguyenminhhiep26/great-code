package ArrayLitses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex_girlfriend_List EX = new Ex_girlfriend_List();


        boolean end = false;
        while (!end) {


            System.out.println("1 - Print out a list of Ex-girlfriends");
            System.out.println("2 - Add an old girlfriend ");
            System.out.println("3 - Delete ex-girlfriend's name ");
            System.out.println("4 - Looking for ex-girlfriend in the list");
            System.out.println("5 - Sort ex-girlfriends by name ");
            System.out.println("6 - Sort old girlfriends by age ");
            System.out.println("7 - End..");
            System.out.println("-------------------------");
            System.out.println("Please choose from 7 of the above");
            int i = Integer.parseInt(sc.nextLine());

            switch (i) {
                case 1: {
                    EX.PrintExGirlfriend();
                    break;
                }
                case 2: {
                    System.out.println(" Name :  ");
                    String name = sc.nextLine();
                    System.out.println(" Age : ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.println(" Address : ");
                    String add = sc.nextLine();
                    System.out.println(" PhoneNumber : ");
                    String phone = sc.nextLine();

                    Ex_girlfriend ex_girlfriend = new Ex_girlfriend(name, age, add, phone);
                    EX.AddEx_girlfriend(ex_girlfriend);
                    System.out.println(ex_girlfriend.toString());
                    break;
                }

                case 3: {
                    System.out.println("The name of the ex you want to delete : ");
                    String name = sc.nextLine();
                    EX.DeleteExGirlfriend(name);
                    System.out.println("You have successfully deleted");
                    break;
                }

                case 4: {
                    System.out.println(" Name : ");
                    String name = sc.nextLine();
                    EX.SearchExGirlfriend(name);
                    break;

                }

                case 5: {
                    EX.SortNameExGirlfriend();
                    break;
                }

                case 6: {
                    EX.SortAgeExGirlfriend();
                    break;
                }

                case 7: {
                    System.out.println("End....");
                    end = true;
                    break;
                }


            }
        }
    }
}
