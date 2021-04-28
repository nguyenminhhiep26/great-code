package De_Thi_ADF;

import java.util.Scanner;

public class TestFlight {
    public static void main(String[] args) {
        Flight f = new Flight();
        f.display();
        System.out.println("The number is : " + f.getNumber());
        System.out.println("The destination is "+ f.getDestination());

        System.out.println("--------------");

        Flight F = new Flight(875,"Toronto");
        F.display();
        System.out.println("The number is : " + F.getNumber());
        System.out.println("The destination is "+ F.getDestination());
    }
}
