package task8.java;

public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public double getArea(){
        System.out.println("hing dang khong xac dinh");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
