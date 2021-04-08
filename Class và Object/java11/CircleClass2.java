package java11;

public class CircleClass2 {
    private double radius;

    public CircleClass2(){
        radius = 1.0;
    }

    public CircleClass2(double r){
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getCircumference(){
        return 2 * radius * Math.PI;
    }

    public String toString(){
       return radius + " , ";
    }

    public static void main(String[] args) {
        CircleClass2 c1 = new CircleClass2();
        System.out.println("The radius is " + c1.getRadius());
        System.out.printf("The area is " + "%.2f\n" , c1.getArea());
        System.out.printf("The Circumference is " + "%.2f", c1.getCircumference());
        System.out.println();
        c1.setRadius(7);
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());


        CircleClass2 c2 = new CircleClass2(2.0);
        System.out.println("The radius is " + c2.getRadius());
        System.out.printf("The area is " + "%.2f\n" , c2.getArea()) ;
        System.out.printf("The Circumference is " + "%.2f" , c2.getCircumference());
        System.out.println();
        c2.setRadius(8);
        System.out.println(c2.getRadius());
        System.out.println(c2.toString());

    }
}
