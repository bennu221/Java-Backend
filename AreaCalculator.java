public class AreaCalculator {

    static int calculateArea(int side) {
        return side * side;
    }


    static double calculateArea(double length, double width) {
        return length * width;
    }


    static float calculateArea(float radius) {
        return 3.14159f * radius * radius;
    }

    public static void main(String[] args) {

        System.out.println(calculateArea(5));
        System.out.println(calculateArea(10.5, 4.0));
        System.out.println(calculateArea(3.0f));

    }
}