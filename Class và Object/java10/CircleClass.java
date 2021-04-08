package java10;

import java.util.Scanner;

public class CircleClass {
    private double radius;
    private String color;


    public CircleClass(double r, String c) {
        radius = r;
        color = c ;
    }


    public CircleClass(double r){
        radius = r;
        color = "red";

    }

    public  CircleClass(){
        radius = 1.0;
        color = "red";
    }




    public double getRadius() {
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
       CircleClass  c1 = new CircleClass(2.0, "blue");
        System.out.println("The radius is : " + c1.getRadius());
        System.out.println("The color is : " + c1.getColor());
        System.out.printf("the area is : " + "%.2f", c1.getArea());

        CircleClass c2 = new CircleClass(2.0);
        System.out.println("The radius is : " + c2.getRadius());
        System.out.println("The color is : " + c2.getColor());
        System.out.printf("The area is : " + "%.2f" , c2.getArea());

        CircleClass c3 = new CircleClass();
        System.out.println("The radius is : " + c3.getRadius());
        System.out.println("The color is : " + c3.getColor());
        System.out.printf("The area is : " + "%.2f" , c3.getArea() );

    }
}
