public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return sum / 5.0;
    }

    public String getGrade() {
        double avg = getAverage();

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 40)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        Student s1 = new Student("Benarji", new int[]{95, 92, 90, 94, 89});
        Student s2 = new Student("Rahul", new int[]{80, 76, 78, 74, 77});
        Student s3 = new Student("Priya", new int[]{55, 60, 58, 52, 50});

        Student[] students = {s1, s2, s3};

        for (Student s : students) {
            System.out.println("Name    : " + s.getName());
            System.out.println("Average : " + s.getAverage());
            System.out.println("Grade   : " + s.getGrade());
            System.out.println();
        }
    }
}