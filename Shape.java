public class Shape {

    double area() {
        return 0;
    }

    public static void main(String[] args) {

        Shape[] shapes = {
            new Rectangle(10, 5),
            new Circle(7)
        };

        for (Shape s : shapes) {
            System.out.println("Area = " + s.area());
        }
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }
}