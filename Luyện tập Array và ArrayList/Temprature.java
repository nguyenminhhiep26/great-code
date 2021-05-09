package BTarraylist;

import java.util.Scanner;

public class Temprature {

    public static void main(String[] args) {
        double sum = 0;
        int j = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("How many day's temperature ? ");
        int numDays = sc.nextInt();
        int ND[] = new int[numDays];

        for (int i = 0; i< numDays; i++){
            System.out.println("Day " + (i+1) + "'s high temp : ");
            Scanner h = new Scanner(System.in);
            ND[i] = h.nextInt();
        }
        for (int i = 0; i < numDays; i ++) {
            sum += ND[i];
        }

        System.out.println("Average : " + sum/numDays);
        for (int i=0; i<numDays;i ++){
            if (ND[i] > (sum/numDays)){
                j=j+1;
            }
        }

        System.out.printf("%d days above average",j);
    }
}
