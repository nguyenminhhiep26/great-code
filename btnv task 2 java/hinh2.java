package btvn;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
            int sum, n , i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n : ");
        sum = sc.nextInt();
        n = sum;
            for ( i = 1 ; i <= sum; i++ )
            {
                for ( int so = sum - i + 1; so >= 1 ; so-- ){
                    System.out.print(" ");
                }
                for (int c = 1; c <= i; c++)
                {
                    System.out.print("*");
                }
                for (int c = i - 1; c >= 1; c--)
                {
                    System.out.print("*");
                }
                System.out.println();


            }
           /* for ( i =1; i<= sum; i++)
            {
                for ( int so = 1 ; so <= i; so++)
                {
                    System.out.print(" ");
                }
                for ( int c = 1; c<= n; c++)
                {
                    System.out.print("*");
                }
                for (int c = sum - i; c >= 1; c--)
                {
                    System.out.print("*");
                }
                n--;
                System.out.println();
            }
            */


    }
}
