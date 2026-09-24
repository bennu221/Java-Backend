abstract class shape{
    void display(){
        System.out.println("This is a shape");
    }
    abstract double area();
}
class circle extends shape{
    double radius;
    circle(double r){
        radius = r;
    }
    double area(){
        return Math.PI * radius * radius;
    }
}
class square extends shape{
    double side;
    square(double s){
        side = s;
    }
    double area(){
        return side * side;
    }
}
public class Main {
    public static void main(String[] args) {
        shape s1 = new circle(5);
        shape s2 = new square(4);
        
        s1.display();
        System.out.println("Area of circle: " + s1.area());
        
        s2.display();
        System.out.println("Area of square: " + s2.area());
    }
}