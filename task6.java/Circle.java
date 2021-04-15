package Task6.java;

public class Circle {
    private double radius;
    private String color;

    public Circle () {
        this.radius = 1;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public String getColor () {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public String toString () {
        return "Radius is : " + radius + ", Color is : " + color;
    }
    public double getArea () {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Radius of C is : " + c.getRadius());
        System.out.println("Color of C is : " + c.getColor());
        System.out.println(c);
        System.out.printf("%.2f\n", c.getArea());
        System.out.println("change radius and color");
        c.setRadius(5);
        c.setColor("yellow");
        System.out.println(c);
        System.out.printf("%.2f\n", c.getArea());

        System.out.println("--------------------------------------------------");
        Circle c1 = new Circle(2);
        System.out.println("Radius of C1 is : " + c1.getRadius());
        System.out.println("Color of C1 is : " + c1.getColor());
        System.out.println(c1);
        System.out.printf("%.2f\n", c1.getArea());
        System.out.println("change radius and color");
        c1.setRadius(8);
        c1.setColor("greed");
        System.out.println(c1);
        System.out.printf("%.2f\n", c1.getArea());

        System.out.println("---------------------------------------------------");
        Circle c2 = new Circle(4, "black");
        System.out.println("Radius of C2 is : " + c2.getRadius());
        System.out.println("Color of C2 is : " + c2.getColor());
        System.out.println(c2);
        System.out.printf("%.2f", c2.getArea());
        System.out.println("change radius and color");
        c2.setRadius(6);
        c2.setColor("write");
        System.out.println(c2);
        System.out.printf("%.2f\n", c2.getArea());

    }
}
