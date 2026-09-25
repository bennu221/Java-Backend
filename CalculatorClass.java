class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class CalculatorClass {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("Two Integers: " + cal.add(10, 20));
        System.out.println("Two Doubles: " + cal.add(10.5, 20.5));
        System.out.println("Three Integers: " + cal.add(10, 20, 30));
        System.out.println("Two Strings: " + cal.add("Hello ", "Java"));
    }
}