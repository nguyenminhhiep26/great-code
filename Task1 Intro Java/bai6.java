package sesion2;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("nhap num1 : ");
        int num1 = SC.nextInt();
        int num2 = 5;
        int num3 = 77;
        int sum, product;

        sum = num1 + num2 + num3;
        product = num1*num2*num3;

        System.out.println("the is sum " + sum);
        System.out.println("The is product" + product);
    }
}
