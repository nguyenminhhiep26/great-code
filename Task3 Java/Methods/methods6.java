package Methods;

import java.util.Arrays;

public class methods6 {
    public static void main(String[] args) {
        int[] testArray = {9, 5, 6, 1, 4};
        System.out.println("In caller, before calling the method, array is : "
        + Arrays.toString(testArray));
        increment(testArray);
        System.out.println("In caller, after calling the method, array is "
        + Arrays.toString(testArray));
    }

    public static void increment(int[] array){
        System.out.println("Inside method, before operation, array is "
        + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) ++array[i];
        System.out.println("Inside method, after operation, array is "
        + Arrays.toString(array));
    }
}
