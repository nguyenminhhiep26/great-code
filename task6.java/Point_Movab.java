package Task6.java;

public class Point_Movab {
    protected float x, y;

    public Point_Movab (float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point_Movab() {
        this.x = 0;
        this.y = 0;
    }

    public float getX() {
        return this.x;
    }
    public float getY () {
        return y;
    }
    public void setX (float x) {
        this.x = x;
    }
    public void setY (float y) {
        this.y = y;
    }
    public void setXY (float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY () {
        float[] result = new float[2];
        result[0] = x;
        result[1] = y;
        return result;
    }
    public String toString () {
        return "(" + x + "," + y + ")";
    }

}




class MovablePoint extends Point_Movab {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint (float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint (float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint () {
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }
    public float getXSpeed () {
        return xSpeed;
    }
    public void setXSpeed (float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed () {
        return ySpeed;
    }
    public void setYSpeed (float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setXSpeedYSpeed (float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getXSpeedYSpeed () {
        float[] result = new float[2];
        result[0] = xSpeed;
        result[1] = ySpeed;
        return result;
    }
    public String toString () {
        return "(" + super.getX() + "," + super.getY() + "), speed = (" + xSpeed + "," + ySpeed + ")";
    }
    public MovablePoint move () {
        x += xSpeed;
        y += ySpeed;
        return this;
    }

    public static void main(String[] args) {
        Point_Movab p = new Point_Movab(2, 4);
        MovablePoint m = new MovablePoint(1, 2, 3, 4);


        System.out.println("X is : " + p.getX());
        System.out.println("Y is : " + p.getY());
        System.out.println(p);
        System.out.println("XSpeed is : " + m.getXSpeed());
        System.out.println("YSpeed is : " + m.getYSpeed());
        System.out.println(m);
        System.out.println("change XSpeed and YSpeed");
        m.setXSpeed(5);
        m.setYSpeed(3);
        System.out.println(m);
        System.out.println(m.move());
    }
}
