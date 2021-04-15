package Task6.java;

public class LineSub extends Point {
    private Point and;
    public LineSub (int x, int y, int x1, int y1) {
        super(x, y);
        this.and = new Point(x1, y1);
    }
    public LineSub (Point begin, Point and) {
        super(begin.getX(), begin.getY());
        this.and = and;
    }
    public Point getBegin () {
        return new Point(super.getX(), super.getY());
    }
    public void setBegin (Point begin) {
        super.setX(begin.getX());
        super.setY(begin.getY());
    }
    public Point getAnd () {
        return and;
    }
    public void setAnd (Point and) {
        this.and = and;
    }
    public int getBeginX () {
        return super.getX();
    }
    public void setBeginX (int x) {
        super.setX(x);
    }
    public int getBeginY () {
        return super.getY();
    }
    public void setBeginY (int y) {
        super.setY(y);
    }
    public int getAndX () {
        return and.getX();
    }
    public void setAndX (int x) {
        this.and.setX(x);
    }
    public int getAndY () {
        return and.getY();
    }
    public void setAndY (int y) {
        this.and.setY(y);
    }
    public int[] getBeginXY () {
        return super.getXY();
    }
    public void setBeginXY (int x, int y) {
        super.setXY(x, y);
    }
    public int[] getAndXY () {
        return and.getXY();
    }
    public void setAndXY (int x, int y) {
        and.setXY(x, y);
    }
    public String toString () {
        return "[ Begin is : " + super.toString() + ", And is : " + and + "]";
    }
    public double getLength () {
        return super.distance(and);
    }

    public static void main(String[] args) {
        LineSub l = new LineSub(2,2,1,3);
        System.out.println(l);
        LineSub l1 = new LineSub(new Point(3, 3), new Point(5,5));

        System.out.println("Begin is : " + l.getBegin());
        System.out.println("And is : " + l.getAnd());

        l.setBegin(new Point(3, 5));
        l.setAnd(new Point(5, 3));
        System.out.println(l);
        System.out.println("BeginX is : " + l.getBeginX());
        System.out.println("BeginY is : " + l.getBeginY());
        System.out.println("AndX is : " + l.getAndX());
        System.out.println("AndY is : " + l.getAndY());
        System.out.println("change x, y, x1, y1");
        l.setBeginX(6);
        l.setBeginY(7);
        l.setAndX(1);
        l.setAndY(2);
        System.out.println(l);

        l.setBeginXY(3,4);
        l.setAndXY(1, 3);
        System.out.println(l);
        System.out.println(l.getBeginXY()[0]);
        System.out.println(l.getBeginXY()[1]);
        System.out.println(l.getAndXY()[0]);
        System.out.println(l.getAndXY()[1]);

        System.out.println(l.getLength());


    }
}
