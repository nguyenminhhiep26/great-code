package Methods;

public class methods1 {
    public static void main(String[] args) {
        double r = 1.1 , area, area2;
        area = getArea(r);
        System.out.println("area is " + area);

        area2 = getArea(2.2);
        System.out.println("area 2 is " + area2);

        System.out.println("area 3 is " + getArea(3.3));

    }
    public static  double getArea(double radius){
        return radius * radius * Math.PI;
    }

}
