package task9;

 class Circle extends Shape {
     float area;
     @Override
     void calculate(float rad){
         area = getPI() * rad * rad;
         System.out.println("Area of circle is : " + area);
     }
}
class  Rectangle extends Shape{
    float perimeter ;
    float length = 10 ;

    @Override
    void calculate(float width){
        perimeter = 2 *(length + width);
        System.out.println("Perimeter of the Rectangle is : " + perimeter);
    }
}
