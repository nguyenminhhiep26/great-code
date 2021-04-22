package task8.java;

public class Triangle extends Shape{
    private int base, height;
    public Triangle(int base, int height , String color){
        super(color);
        this.height = height;
        this.base = base;
    }

    public double getArea(){
        return 0.5*base*height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height + "," + super.toString() +
                '}';
    }

}
