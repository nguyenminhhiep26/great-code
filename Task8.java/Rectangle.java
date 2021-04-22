package task8.java;

public class Rectangle extends  Shape{
    private int length, width;
    public Rectangle ( int length, int width, String color){
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width ;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width + " ," + super.toString() +
                '}';
    }
}
