package De_Thi_ADF;

import java.util.Scanner;

public class TestBank  {
    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.print("The balance is : $ " );
        b.balance = sc.nextDouble();
        System.out.print("The rate  is: " );
        b.rate = sc.nextDouble();
        System.out.println(b.toString());
        b.setBalance(1000);
        System.out.println("Balance : " + b.balance);
        System.out.println("Rate : " + b.rate);
        System.out.printf("The calculateInterest is : $%.2f " , b.calculateInterest());
    }
}
