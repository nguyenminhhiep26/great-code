package java11;


public class CircleClass1 {
    private double radius;
    private String color;


    public CircleClass1(double r, String c) {
        radius = r;
        color = c ;
    }


    public CircleClass1(double r){
        radius = r;
        color = "red";

    }

    public CircleClass1(){
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

    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String toString () {
        return radius + " , " + color;
    }

    public static void main(String[] args) {
        CircleClass1 c1 = new CircleClass1(2.0, "blue");
        System.out.println("The radius is : " + c1.getRadius());
        System.out.println("The color is : " + c1.getColor());
        System.out.printf("the area is : " + "%.2f", c1.getArea());
        System.out.println();
        c1.setRadius(7);
        System.out.println(c1.getRadius());
        c1.setColor("with");
        System.out.println(c1.getColor());
        System.out.println(c1.toString());

        CircleClass1 c2 = new CircleClass1(2.0);
        System.out.println("The radius is : " + c2.getRadius());
        System.out.println("The color is : " + c2.getColor());
        System.out.printf("The area is : " + "%.2f" , c2.getArea());
        System.out.println();
        c2.setRadius(9);
        System.out.println(c2.getRadius());
        c2.setColor("violet");
        System.out.println(c2.getColor());
        System.out.println(c2.toString());

        CircleClass1 c3 = new CircleClass1();
        System.out.println("The radius is : " + c3.getRadius());
        System.out.println("The color is : " + c3.getColor());
        System.out.printf("The area is : " + "%.2f" , c3.getArea() );
        System.out.println();
        c3.setRadius(8);
        System.out.println(c3.getRadius());
        c3.setColor("green");
        System.out.println(c3.getColor());
        System.out.println(c3.toString());

    }
}

