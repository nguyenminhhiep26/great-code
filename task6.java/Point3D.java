package Task6.java;

public class Point3D extends Point2D {
    private int z;
    public Point3D () {
        super();
        this.z = 1;
    }
    public Point3D (int z) {
        super();
        this.z = z;
    }
    public Point3D (int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    public int getZ () {
        return z;
    }
    public void setZ (int z) {
        this.z = z;
    }
    public String toString () {
        return "(" + super.getX() + "," + super.getY() + "," + z + ")";
    }

    public static void main(String[] args) {
        Point3D p = new Point3D();
        System.out.println("X is : " + p.getX());
        System.out.println("Y is : " + p.getY());
        System.out.println("Z is : " + p.getZ());
        System.out.println(p);
        System.out.println("change X and Y and Z");
        p.setZ(4);
        p.setX(5);
        p.setY(2);
        System.out.println(p);

        System.out.println("-----------------------------------");
        Point3D p1 = new Point3D(3);
        System.out.println("X is : " + p1.getX());
        System.out.println("Y is : " + p1.getY());
        System.out.println("Z is : " + p1.getZ());
        System.out.println(p1);
        System.out.println("change X and Y and Z");
        p1.setZ(4);
        p1.setX(5);
        p1.setY(2);
        System.out.println(p1);

        System.out.println("---------------------------------------");
        Point3D p2 = new Point3D(4, 4, 4);
        System.out.println("X is : " + p2.getX());
        System.out.println("Y is : " + p2.getY());
        System.out.println("Z is : " + p2.getZ());
        System.out.println(p2);
        System.out.println("change X and Y and Z");
        p2.setZ(4);
        p2.setX(5);
        p2.setY(2);
        System.out.println(p2);

    }
}
