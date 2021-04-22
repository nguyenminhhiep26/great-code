package task8.java;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public String toString(){
        return "radius " + radius + " " ;

    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

}
