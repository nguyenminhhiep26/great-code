package task8.java;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint T =new MovablePoint(4,6);
        System.out.println(T);
        T.moveDown();
        System.out.println(T);
        T.moveRight();
        System.out.println(T);

        Movable T2 = new MovablePoint(3,4);
        T2.moveUp();
        System.out.println(T2);

        MovablePoint T3 = (MovablePoint)T2;
        System.out.println(T3);
    }
}
