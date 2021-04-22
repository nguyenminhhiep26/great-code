package task8.java;

public class Cylinder extends Circle {
    private  double height;
    public Cylinder (double height, double radius){
        super(radius);
        this.height =height;
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

    public double getArea(){
        return 2.0 * Math.PI * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +", "+ super.toString() +
                '}';
    }

    public static void main(String[] args) {
        Circle C = new Cylinder(5.0, 3.0);
        System.out.println(C);
        System.out.println("The radius " + C.getRadius());
        System.out.println("The height " + C.toString());
        System.out.println("The area is " + C.getArea()) ;



    }
}
