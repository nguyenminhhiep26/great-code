package Task5.java;

public class Point {
    private int x ;
    private int y ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        this.x = 0;
        this.y = 0;
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

    public String toString(){
        return x+","+y;
    }

    public int[] getXY(){
        int[] results = new int[2];
        results[0]=this.x;
        results[1]=this.y;
        return results;
    }

    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }

    public static void main(String[] args) {
        ClasesandObjects.Point p1 = new ClasesandObjects.Point(1, 2);
        System.out.println(p1);
        ClasesandObjects.Point p2 = new ClasesandObjects.Point();
        System.out.println(p2);

        p1.setX(3);
        p2.setY(4);
        System.out.println(p1);
        System.out.println("X is :  " + p1.getX());
        System.out.println("Y is : " + p2.getY() );

        p1.setXY(5,6);
        System.out.println(p1);
        System.out.println("X is : " + p1.getXY()[0]);
        System.out.println("Y is : "+ p1.getXY()[1]);

        p2.setXY(10,11);
        System.out.printf("Distance is : " + "%.2f%n" , p1.distance(10,11));
        System.out.printf("Distance is : " + "%.2f%n" , p1.distance());


    }
}
