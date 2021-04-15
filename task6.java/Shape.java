package Task6.java;

public class Shape {
    protected String color;
    protected boolean filled;

    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        this.color = "greed";
        this.filled = true;
    }

    public String getColor () {
        return color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public boolean isFilled () {
        return filled;
    }
    public void setFilled (boolean filled) {
        this.filled = filled;
    }
    public String toString () {
        return "[Color = " + color + ", Filled = " + filled + "]";
    }

}

class Circle1 extends Shape {
    private double radius;

    public Circle1 () {
        super();
        this.radius = 1;
    }
    public Circle1 (double radius) {
        super();
        this.radius = radius;
    }
    public Circle1 (double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }
    public double getArea () {
        return 2 * Math.PI * radius * radius;
    }
    public double getPerimeter () {
        return 2 * Math.PI * radius;
    }
    public String toString () {
        return "Circle [ Shape [ color = " + super.getColor() + ", Filled = " + super.isFilled() + "], Radius = " + radius + "]";

    }
}
class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle () {
        super();
        this.width = 1;
        this.length = 1;
    }
    public Rectangle (double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle (String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth () {
        return width;
    }
    public double getLength () {
        return length;
    }
    public void setWidth (double width) {
        this.width = width;
    }
    public void setLength (double length) {
        this.length = length;
    }
    public double getArea () {
        return width * length;
    }
    public double getPerimeter () {
        return width + length;
    }
    public String toString () {
        return "Rectangle [ Shape [ color = " + super.getColor() + ", Filled = " + super.isFilled() + "], Width = " + width + ", length = " + length + "]";

    }
}

class Square extends Rectangle {
    private double side;
    public Square () {
        super();
        this.side = 1;
    }
    public Square (double side) {
        super();
        this.side = side;
    }
    public Square (double side, double width, double length, String color, boolean filled) {
        super(color, filled, width, length);
        this.side = side;
    }
    public double getSide () {
        return side;
    }
    public void setSide (double side) {
        this.side = side;
    }
    public void setWidth (double side) {
        this.width = side;
        this.length = width;
    }
    public void setLength (double side) {
        this.width = length;
        this.length = side;
    }
    public String toString () {
        return "Square [ Rectangle [ Shape [ color = " + super.getColor() + ", Filled = " + super.isFilled() + "], Width = " + width + ", length = " + length + "]]";

    }

    public static void main(String[] args) {
        Shape s = new Shape("red", true);
        System.out.println(s);
        System.out.println("Color of Shape is : " + s.getColor());
        System.out.println("Filled of Shape is : " + s.isFilled());
        System.out.println("change color and filled");
        s.setColor("yellow");
        s.setFilled(false);
        System.out.println(s);
        System.out.println("-------------------------and Shape-----------------------------");
        Circle1 c = new Circle1(5, "red", true);
        System.out.println(c);
        System.out.println("Radius Circle is : " + c.getRadius());
        System.out.printf("Area of Circle is : %.2f\n", c.getArea());
        System.out.printf("Perimeter of Circle is : %.2f\n", c.getPerimeter());
        System.out.println("-------------------------and Circle1---------------------------");
        Rectangle r = new Rectangle("yellow", true, 5, 10);
        System.out.println(r);
        System.out.println("Color of Shape is : " + r.getColor());
        System.out.println("Filled of Shape is : " + r.isFilled());
        System.out.println("Width of rectangle is : " + r.getWidth());
        System.out.println("Length of rectangle is : " + r.getLength());
        System.out.println("Area of rectangle is : " + r.getArea());
        System.out.println("Perimeter of rectangle is : " + r.getPerimeter());
        System.out.println("change color and filled and width and length");
        r.setColor("red");
        r.setFilled(false);
        r.setWidth(3);
        r.setLength(7);
        System.out.println(r);
        System.out.println("Color of Shape is : " + r.getColor());
        System.out.println("Filled of Shape is : " + r.isFilled());
        System.out.println("Width of rectangle is : " + r.getWidth());
        System.out.println("Length of rectangle is : " + r.getLength());
        System.out.println("Area of rectangle is : " + r.getArea());
        System.out.println("Perimeter of rectangle is : " + r.getPerimeter());
        System.out.println("----------------------and Rectangle-------------------------");
        Square S = new Square(5,3, 6, "red", true);
        System.out.println(S);
        System.out.println(S.side);


    }
}
