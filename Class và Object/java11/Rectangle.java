package java11;

public class Rectangle {
    private float length ;
    private float width;

    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float h, float r){
        length = h;
        width = r;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return 2 * (width + length);
    }

    public String toString(){
        return width + " ," + length;
    }

    public static void main(String[] args) {
        Rectangle c1 = new Rectangle();
        System.out.println("The length is : " + c1.getLength() );
        c1.setLength(3);
        System.out.println(c1.getLength());
        System.out.println("The width is :  " + c1.getWidth());
        c1.setWidth(4);
        System.out.println(c1.getWidth());
        System.out.println("The Area is : "  + c1.getArea() );
        System.out.println("The Perimeter is :  " + c1.getPerimeter());
        System.out.println("The toString is :" + c1.toString());
        System.out.println();

        Rectangle c2 = new Rectangle(2.0f, 2.0f);
        System.out.println("The length is : " + c2.getLength());
        c2.setLength(2);
        System.out.println(c2.getLength());
        System.out.println("The width is : " + c2.getWidth());
        c2.setWidth(3);
        System.out.println(c2.getWidth());
        System.out.println("The Area is :" + c2.getArea());
        System.out.println("The Perimeter is : " + c2.getPerimeter());
        System.out.println("The toString is :" + c2.toString());

    }
}
