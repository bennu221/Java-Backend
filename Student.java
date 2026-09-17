class Student {
    String name;
    int age;
    String studentId;

    Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }

    void display() {
        System.out.println(name +" " + age + " " + studentId);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Benarji", 21, "S101");
        Student s2 = new Student("Rahul", 22, "S102");
        Student s3 = new Student("Priya", 20, "S103");

        s1.display();
        s2.display();
        s3.display();
    }
}