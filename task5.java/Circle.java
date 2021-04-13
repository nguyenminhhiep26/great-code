package Task5.java;

public class Circle {
    private Point center;
    private double radius;

    public Circle(){
        this.center = new Point();
        this.radius = 1.0;
    }

    public Circle( int xCenter , int yCenter , double radius){
        center = new Point(xCenter, yCenter);
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }

    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    public String toString(){
        return "Circle[center=" + center + ",radius = " + radius + "]";
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    public double distance(Circle another){
        return center.distance();
    }


    public static void main(String[] args) {
        Circle HT1 = new Circle();
        System.out.println(HT1);
        Circle HT2 = new Circle(2,2,4.0);
        System.out.println(HT2);
        Circle HT3 = new Circle(new Point(4,5),6.0);
        System.out.println(HT3);

        HT1.setCenter(new Point(10,11));
        HT1.setRadius(12.0);
        System.out.println(HT1);
        System.out.println("The Center is : " + HT1.getCenter());
        System.out.println("The radius is : " + HT1.getRadius());

        HT1.setCenterX(21);
        HT1.setCenterY(22);
        System.out.println(HT1);
        System.out.println("The CenterX  is : " + HT1.getCenterX());
        System.out.println("The CenterY is : " + HT1.getCenterY());
        HT1.setCenterXY(14,16);
        System.out.println(HT1);
        System.out.println("The centerX is : "+ HT1.getCenterXY()[0]);
        System.out.println("The centerY is : " + HT1.getCenterXY()[1]);

        System.out.printf("The area is " + "%.2f%n" ,HT1.getArea());
        System.out.printf("The circumference is " + "%.2f%n", HT1.getCircumference());

        System.out.printf("distance is : " + " %.2f%n" , HT1.distance(HT2));
        System.out.printf("distance is : " + "%.2f%n" ,HT2.distance(HT1));

    }
}
