package exercise7;

public class TestTriangle {
    public static void main(String[] args) {
        Point A = new Point();
        Point B = new Point();
        Point C = new Point();

        System.out.printf("nhap diem A :");
        A.nhap();
        System.out.printf("nhap diem B :");
        B.nhap();
        System.out.printf("nhap diem C :");
        C.nhap();

        Triangle t = new Triangle(A, B, C);

        System.out.println(t);
        System.out.println("Point A is : " + t.getPointA());
        System.out.println("Point B is : " + t.getPointB());
        System.out.println("Poin C is : " + t.getPointC());
        System.out.println("Distance AB is : " + t.distanceAB());
        System.out.println("Distance BC is : " + t.distanceBC());
        System.out.println("Distance AC is : " + t.distanceAC());
        System.out.println("Perimeter is : " + t.perimeter());
        System.out.println("Area is : " + t.Area());

        if( (A.getY()-B.getY())*(C.getX()-A.getX()) + (B.getX()-A.getX())*(C.getY()-A.getY()) == 0){
            System.out.printf("ko phai la tam giac");
        }
        else {
            System.out.printf("la tam giac");
        }
    }
}
