package baitaptrenlop;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        int Quantity1, Quantity2, PriceShirts=300, PriceTrousers=700,Total1,Total2;
        double Discount = 0, Net, Points = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Shirts to order : ");
        Quantity1 = sc.nextInt();
        System.out.println("Enter the number of Trousers to order : ");
        Quantity2 = sc.nextInt();
        Total1 = Quantity1 * PriceShirts;
        Total2 = Quantity2 * PriceTrousers;

        System.out.println("Item" +     "            " + "Quantity" + "                        "+ " Price "+    "             " + "Total" );
        System.out.println("==============================================================================================");
        System.out.println("Shirts"   +   "              " + Quantity1 +  "                             "+ PriceShirts +  "               " + Total1 );
        System.out.println("Trousers" + "            " + Quantity2 +  "                             "+ PriceTrousers+ "               " + Total2 );

        if ((Total1+Total2) > 3000) {
            Discount = (Total1+Total2)/10;
        }
        System.out.println("Discount" + "                                                            " + Discount);
        System.out.println("==============================================================================================");
        Net = (Total1+Total2)- Discount;
        System.out.println("Net Total" + "                                                           " + Net);
        System.out.println("==============================================================================================");
        if (Net > 3000) {
            Points = Net/100;
        }
        System.out.println("Points Earned" + "                    " + Points);
        System.out.println("Thank you!");





    }
}
