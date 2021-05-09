package BTarraylist;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 integer value ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Element " + (i + 1) + ", types value was " + arr[i]);
            sum += arr[i];
            avg = sum/n;
        }
        System.out.println("Average is " + avg);
    }
}
