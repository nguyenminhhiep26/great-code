package Task6.java;

public class Cylinder extends Circle {
    private double height;

    public Cylinder () {
        super();
        this.height = 1;
    }
    public Cylinder (double height) {
        super();
        this.height = height;
    }
    public Cylinder (double height, double radius) {
        super(radius);
        this.height = height;
    }
    public Cylinder (double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight () {
        return height;
    }
    public void setHeight (double height) {
        this.height = height;
    }
    public String toString () {
        return "this is a Cylinder ";
    }
    public double getVolume () {
        return getArea() * height;
    }

    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.println("Height of C is : " + c.getHeight() + ", Radius of C is : " + c.getRadius() + ", Color of C is : " + c.getColor());
        System.out.println(c);
        System.out.printf("Area of C is : %.2f\n", c.getArea());
        System.out.printf("Volume of C is %.2f\n ", c.getVolume());
        System.out.println("change height of C");
        c.setHeight(5);
        System.out.println("Height of C is : " + c.getHeight() + ", Radius of C is : " + c.getRadius() + ", Color of C is : " + c.getColor());
        System.out.println(c);
        System.out.printf("Area of C is : %.2f\n", c.getArea());
        System.out.printf("Volume of C is %.2f\n ", c.getVolume());

        System.out.println("-----------------------------------------------");
        Cylinder c1 = new Cylinder(4);
        System.out.println("Height of C1 is : " + c.getHeight() + ", Radius of C1 is : " + c.getRadius() + ", Color of C1 is : " + c.getColor());
        System.out.println(c1);
        System.out.printf("Area of C1 is : %.2f\n", c1.getArea());
        System.out.printf("Volume of C1 is %.2f\n ", c1.getVolume());

        System.out.println("-----------------------------------------------");
        Cylinder c2 = new Cylinder(3, 5);
        System.out.println("Height of C2 is : " + c2.getHeight() + ", Radius of C2 is : " + c2.getRadius() + ", Color of C2 is : " + c2.getColor());
        System.out.println(c2);
        System.out.printf("Area of C2 is : %.2f\n", c2.getArea());
        System.out.printf("Volume of C2 is %.2f\n ", c2.getVolume());

        System.out.println("-----------------------------------------------");
        Cylinder c3 = new Cylinder(4, 7, "yellow");
        System.out.println("Height of C3 is : " + c3.getHeight() + ", Radius of C3 is : " + c3.getRadius() + ", Color of C3 is : " + c3.getColor());
        System.out.println(c3);
        System.out.printf("Area of C is : %.2f\n", c3.getArea());
        System.out.printf("Volume of C is %.2f\n ", c3.getVolume());
        System.out.println("change all of C3");
        c3.setRadius(6);
        c3.setHeight(8);
        c3.setColor("red");
        System.out.println("Height of C3 is : " + c3.getHeight() + ", Radius of C3 is : " + c3.getRadius() + ", Color of C3 is : " + c3.getColor());
        System.out.println(c3);
        System.out.printf("Area of C is : %.2f\n", c3.getArea());
        System.out.printf("Volume of C is %.2f\n ", c3.getVolume());

    }

}
