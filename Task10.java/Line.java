package Task10;

public class Line extends Shape{
    private int length;

    public Line(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public void draw() {
        for(int i=0;i<length;i++) {
            System.out.print("-");
        }
    }
}
