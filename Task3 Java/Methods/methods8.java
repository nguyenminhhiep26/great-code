package Methods;

public class methods8 {
    public static void main(String[] args) {
        int[] a1 = {9, 1, 2, 6 , 5};
        System.out.println(sum(a1));
        double[] a2 = {1.1, 2.2, 3.3};
        System.out.println(sum(a2));
        float[] a3 = {1.1f, 2.2f, 3.3f};
    }

    public static int sum(int[] array){
        System.out.println("version 1");
        int sum = 0;
        for (int item : array) sum += item;
        return sum;
    }

    public static double sum(double[] array)
    {
        System.out.println("version 2");
        double sum = 0.0;
        for (double item : array) sum += item;
        return sum;

    }
}

