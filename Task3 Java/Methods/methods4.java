/* package Methods;

import java.util.Scanner;

public class methods4 {
    public static void main(String[] args) {
        int numItem;
        int[] items;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the  umber os items : ");
        numItem = in.nextInt();

        items = new int[numItem];

        if (items.length > 0){
            System.out.print("Enter the value of all items : ");
            for (int i = 0; i < items.length ; i++){
                items[i] = in.nextInt();
            }
        }

        System.out.print("The values are : ");
        print(items);
        System.out.println("The min is : " + min(items));
        System.out.println("The max is : " + max(items));
        System.out.println("The sum is : " + sum(items));

        System.out.print("The average is :  %.2f%n", + average(items));
        in.close();
    }

    public  static void  print(int[] array){
        System.out.print("[");
        for (int i =0; i < array.length; i++){
            System.out.print(i == 0) ? array[i] : " ," + array[i];
        }
        System.out.println("]");
    }

    public static void min(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static void max(int[] array){
        int max = array[0];
        for (int i =1 ; i <array.length; i++){
            if (array[i] > max ) max = array[i];
        }
        return max;
    }

    public static void sum(int[] array){
        int sum = 0;
        for (int item : array) sum+= item;
        return sum;
    }

    public static double average(int[] array){
        return (double) (sum(array)) / array.length;
    }
}
 */