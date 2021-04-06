package Arrays;

public class array3 {
    public static void main(String[] args) {
        int [] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum= 0;
        int sumSq = 0;
        double mean, stdDev;

        for (int i = 0; i < marks.length; i++)
        {
            sum+= marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double) sum/ marks.length;
        stdDev = Math.sqrt((double) sumSq / marks.length - mean * mean);

        System.out.printf("Mean is : %.2f%n", mean);
        System.out.printf("Standaed deviation is : %.2f%n", stdDev);
    }
}
