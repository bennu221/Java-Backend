class Shape{
    double area(){
        return 0;
    }
}
class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    double area(){
        return length*width;
    }
}
class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double area(){
        return 3.14*radius*radius;
    }
}
class Triangle extends Shape{
    double base;
    double height;
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    double area(){
        return 0.5*base*height;
    }
}
public class ShapeClass {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + s1.area());

        Shape s2 = new Circle(7);
        System.out.println("Area of Circle: " + s2.area());

        Shape s3 = new Triangle(6, 8);
        System.out.println("Area of Triangle: " + s3.area());
    }
}