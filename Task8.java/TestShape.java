package task8.java;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(4,5,"red");
        System.out.println(s1);
        System.out.println("The area is " + s1.getArea());

        Shape s2 = new Triangle(4,5,"blue");
        System.out.println(s2);
        System.out.println("The area is " + s2.getArea());

        Shape s3 = new Shape("green");
        System.out.println(s3);
        System.out.println("The area is : " + s3.getArea());
    }
}
