package baitaptrenlop;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks obtained in Maths : ");
        int a = sc.nextInt();
        System.out.println("Enter marks obtained in Science : ");
        int b = sc.nextInt();
        System.out.println("Enter marks obtained in English : ");
        int c = sc.nextInt();

        System.out.println("Enter marks obtained in Maths : ");
        int d = sc.nextInt();
        System.out.println("Enter marks obtained in Science : ");
        int e = sc.nextInt();
        System.out.println("Enter marks obtained in English : ");
        int f = sc.nextInt();

        System.out.println("Marks of ThiDK : ");
        System.out.println("Maths = " + a);
        System.out.println("Science = " + b);
        System.out.println("English = " + c);

        System.out.println("Marks of Bill : ");
        System.out.println("Maths = " + d);
        System.out.println("Science = " + e);
        System.out.println("English = " + f);


       int sum1 = a + b +c, sum2 = d + e +f;
       int agv1 = (a + b +c)/3, avg2 = (d + e +f)/3;


        System.out.println("Total marks scored by ThiDK = " + sum1 );
        System.out.println("Percentage = " + agv1 + "%" );
        System.out.println("Total marks scored by Bill = " + sum2 );
        System.out.println("Percentage = " + avg2 + "%");

        if(agv1 < avg2){
            System.out.println("No");
        }
        else if(agv1 > avg2){
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        if(agv1 > 75)
        {
            System.out.println("Scholarship Amount for ThiDk = $20000");

        }
        else if(agv1 > 60 && agv1 < 75){
            System.out.println("Scholarship Amount for Bill = $10000");
        }
        else {
            System.out.println("ngu thi nhin");
        }
          if(avg2 > 75){
              System.out.println("Scholarship Amount for ThiDk = $20000");
        }
          else if(avg2 > 60 && avg2 < 75){
              System.out.println("Scholarship Amount for Bill = $10000");
          }
          else {
              System.out.println("ngu thi nhin");
          }



    }
}
