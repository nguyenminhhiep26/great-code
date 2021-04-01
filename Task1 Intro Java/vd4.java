package sesion2;

public class vd4 {
    public static void main(String[] args) {
        int num1 = 98;
        int num2 = 5;
         int sum, difference, product, quotient, remainder;

         sum = num1 + num2;
         difference = num1 - num2;
         product = num1 * num2;
         quotient = num1 / num2;
         remainder = num1 % num2;

        System.out.println("The sum, difference, product, quotient, remainder of ");
        System.out.print (num1);
        System.out.print(" and ");
        System.out.print(num2);
        System.out.print(" are ");
        System.out.print(sum);
        System.out.print(", ");
        System.out.print(difference);
        System.out.print(", ");
        System.out.print(product);
        System.out.print(", ");
        System.out.print(quotient);
        System.out.print(", ");
        System.out.print(", and ");
        System.out.print(remainder);

        ++num1;
        --num2;

        System.out.println("num1 after increment is " + num1);
        System.out.println("num2 after decrement is " + num2);
        quotient = num1 / num2;
        System.out.println("The new quotient of " + num1 + " and " + num2 + "is " + quotient);
    }
}
