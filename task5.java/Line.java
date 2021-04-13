package Task5.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Line {
    private Point begin;
    private Point emd;
    public Line(int x1, int y1, int x2 , int y2){
        begin = new Point(x1,y1);
        emd = new Point(x2,y2);
    }

    public Line(Point begin, Point emd) {
        this.begin = begin;
        this.emd = emd;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEmd() {
        return emd;
    }

    public void setEmd(Point emd) {
        this.emd = emd;
    }

    public int getBeginX(){
        return begin.getX();
    }

    public void setBeginX(int x){
          begin.setX(x);
    }

    public int getBeginY(){
        return begin.getY();
    }

    public void setBeginY (int y){
        begin.setY(y);
    }

    public int[] getBeginXY(){
        return begin.getXY();
    }

    public void setBeginXY(int x, int y){
        begin.setXY(x, y);
    }

    public int getEndX(){
        return emd.getX();
    }

    public void setEndX ( int x ) {
        emd.setX(x);
    }

    public int getEndY(){
        return emd.getY();
    }

    public void  setEndY ( int y){
        emd.setY(y);
    }

    public int[] getEndXY(){
        return emd.getXY();
    }

    public void setEndXY(int x, int y){
        emd.setXY(x,y);
    }

    public String toString(){
        return "Line[begin ="  + begin + " , end = " + emd + "]";
    }
    public double getLength(){
        return begin.distance();
    }

    public static void main(String[] args) {
        Line SP1 = new Line(1,2,3,4);
        System.out.println(SP1);
        Line SP2 = new Line(new Point(5,6), new Point(7,8));
        System.out.println(SP2);

        SP1.setBegin(new Point(11,12));
        SP1.setEmd(new Point(13,14));

        System.out.println(SP1);
        System.out.println("Begin is  " + SP1.getBegin());
        System.out.println("End is " + SP1.getEmd());

        SP1.setBeginX(21);
        SP1.setBeginY(22);
        SP1.setEndX(23);
        SP1.setEndY(24);
        System.out.println(SP1);
        System.out.println("Begin's x is : " + SP1.getBeginX());
        System.out.println("begin's y is " + SP1.getBeginY());
        System.out.println("end's x is : " + SP1.getEndX());
        System.out.println("end's y is : " + SP1.getEndY());

        SP1.setBeginXY(11,22);
        SP1.setEndXY(33,44);
        System.out.println(SP1);

        System.out.println("Begin's x and y are " + Arrays.toString(SP1.getBeginXY()));
        System.out.println("End's x and y are " + Arrays.toString(SP1.getEndXY()));

        System.out.printf("Length is : " + "%.2f", SP1.getLength());
    }
}
