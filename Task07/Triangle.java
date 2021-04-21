package exercise7;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle (Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public String toString () {
        return pointA + "," + pointB + "," + pointC;
    }

    public double distanceAB () {
        return pointA.distance(pointB);
    }

    public double distanceBC () {
        return pointB.distance(pointC);
    }

    public double distanceAC () {
        return pointA.distance(pointC);
    }

    public double perimeter () {
        return distanceAB() + distanceAC() + distanceBC();
    }

    public double Area () {
        return Math.sqrt(perimeter()*(perimeter() - distanceAB()) * perimeter() * (perimeter() - distanceBC()) * perimeter() * (perimeter() - distanceAC()));
    }
}
