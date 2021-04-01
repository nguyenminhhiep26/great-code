package sesion2;

public class vd6 {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int number = lowerbound;

        while (number <= upperbound ){
            if (number % 2 == 0){
                sumEven += number;
            }
            else {
                sumOdd += number;
            }
            ++number;
        }
        System.out.println("THe sum of odd numbers from " + lowerbound + " to " + upperbound+ "is " + sumOdd);
        System.out.println("THe sum of even numbers from " + lowerbound + " to " + upperbound+ "is " + sumEven);
        System.out.println("THe diference between the two sum is" + (sumOdd - sumEven));
    }
}
