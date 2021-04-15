package Task6.java;

public class Point {
    private int x, y;
    public Point (int x, int y) {
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
    public int[] getXY () {
        int[] result = new  int[2];
        result[0] = x;
        result[1] = y;
        return result;
    }
    public void setXY (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString () {
        return "(" + x + "," +y + ")";
    }
    public double distance (int x, int y) {
        int rangeX = this.x - x;
        int rangeY = this.y - y;
        return Math.sqrt(rangeX * rangeX + rangeY * rangeY);
    }
    public double distance (Point another) {
        int rangeX = this.x - another.x;
        int rangeY = this.y - another.y;
        return Math.sqrt(rangeX * rangeX + rangeY * rangeY);
    }
    public double distance () {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public static void main(String[] args) {
        Point p = new Point(1, 1);
        System.out.println("X is : " + p.getX());
        System.out.println("Y is : " + p.getY());
        System.out.println(p);
        System.out.printf("Distance is : ", p.distance());
        System.out.printf("Distance of value is : %.2f\n", p.distance(4,4));
        System.out.println("--------------------------------------");
        Point p1 = new Point(2, 2);
        System.out.println("X is : " + p1.getX());
        System.out.println("Y is : " + p1.getY());
        System.out.println(p1);
        System.out.printf("Distance is : ", p1.distance());
        System.out.printf("Distance of value is : %.2f\n", p1.distance(4,4));
        System.out.printf("Distance of object is : %.2f\n", p1.distance(p));
    }
}
