package task8.java;

public class MovablePoint implements Movable{
    private int x, y;
    public MovablePoint(int x , int y ){
        super();
        this.x= x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void moveUp(){
        y--;
    }

    public void moveDown(){
        y++;
    }

    public void moveLeft(){
        x--;
    }

    public void moveRight(){
        x++;
    }
}
