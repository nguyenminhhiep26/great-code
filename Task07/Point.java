package exercise7;

import java.util.Scanner;

public class Point {
    private int x, y;

    public Point () {

    }

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString () {
        return "(" + x + "," + y + ")";
    }

    public double distance (Point p) {
        double rangeX = this.x - p.x;
        double rangeY = this.y - p.y;
        return Math.sqrt(Math.pow(rangeX, 2) + Math.pow(rangeY, 2));
    }

    public void nhap () {
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextInt();
        this.y = sc.nextInt();
    }
}
