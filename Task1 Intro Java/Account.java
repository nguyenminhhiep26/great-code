package sesion2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Account {
    public static void main(String[] args)
    {
        // Declaring and initializing the variables
        double accountBalance = 10000.00;
        double withdraw = 0.00;
        boolean possible = false;
        String cusname;

        //Accepting user input and storing it in variables
        System.out.printf("Available account balance: $%.2f\n", accountBalance);
        System.out.printf("Enter the Amount to withdraw : $");
        Scanner scan = new Scanner(System.in);

        //withdraw = scan.nextDouble();
        withdraw = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the Customer Name: ");
        cusname = scan.nextLine();

        /* Decision making whether sufficient balance is present for
        transaction to proceed.
         */
        possible = (accountBalance > withdraw);
        accountBalance = possible ? accountBalance - withdraw : accountBalance;
        System.out.println("Welcome" + cusname);
        System.out.printf("\nCurrent account balance: $%.2f", accountBalance);
        System.out.println("\nTransaction Successful: " + possible);
    }
}
