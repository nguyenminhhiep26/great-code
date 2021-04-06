package Arrays;

import java.util.Arrays;

public class array6 {
    public static void main(String[] args) {
        int [] a1 = {6 , 1, 3, 4 , 5};
        int [] a2 = {};
        double[] a3 = new double[1];

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
        a3[0] = 2.2;
        System.out.println(Arrays.toString(a3));
    }
}
