public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {
        Student s = new Student("Benarji", 21, "ID123", "Java");
        s.displayInfo();
    }
}

class Student extends Person {
    String studentId;
    String course;

    Student(String name, int age, String studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID : " + studentId);
        System.out.println("Course     : " + course);
    }
}