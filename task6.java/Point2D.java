package Task6.java;

public class Point2D {
    private int x, y;

    public Point2D () {
        this.x = 0;
        this.y = 0;
    }
    public Point2D (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX () {
        return x;
    }
    public void setX (int x) {
        this.x = x;
    }
    public int getY () {
        return y;
    }
    public void setY (int y) {
        this.y = y;
    }
    public String toString () {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Point2D p = new Point2D();
        System.out.println("X is : " + p.getX());
        System.out.println("Y is : " + p.getY());
        System.out.println(p);
        System.out.println("change X and Y");
        p.setX(2);
        p.setY(2);
        System.out.println(p);

        System.out.println("---------------------------");
        Point2D p1 = new Point2D(3, 3);
        System.out.println("X is : " + p1.getX());
        System.out.println("Y is : " + p1.getY());
        System.out.println(p1);
        System.out.println("change X and Y");
        p1.setX(5);
        p1.setY(5);
        System.out.println(p1);

    }
}
