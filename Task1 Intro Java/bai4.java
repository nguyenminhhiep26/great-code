package sesion2;

public class bai4 {
    public static void main(String[] args) {
       double PI, radius, height, surfaceArea, baseArea, volume;

       radius = 1.2;
       height = 5.123;
       PI = 3.14159265;

       surfaceArea = 2 * PI * radius * height;
       baseArea = surfaceArea + (2 * PI * radius*radius);
       volume = PI * radius * radius * height;

        System.out.println("The is radius : " + radius);
        System.out.println("The is height : " + height);
        System.out.println("The is PI : " + PI);
        System.out.println("The is surfaceArea : " + surfaceArea);
        System.out.println("The is baseArea : "+ baseArea);
        System.out.println("THe is volume : " + volume);
    }
}
