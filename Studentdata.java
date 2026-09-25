public class Studentdata {

    private String name;
    private int[] marks;

    public Studentdata(String name, int[] marks) {
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

        Studentdata s1 = new Studentdata("Benarji", new int[]{95, 92, 90, 94, 89});
        Studentdata s2 = new Studentdata("Rahul", new int[]{80, 76, 78, 74, 77});
        Studentdata s3 = new Studentdata("Priya", new int[]{55, 60, 58, 52, 50});

        Studentdata[] students = {s1, s2, s3};

        for (Studentdata s : students) {
            System.out.println("Name    : " + s.getName());
            System.out.println("Average : " + s.getAverage());
            System.out.println("Grade   : " + s.getGrade());
            System.out.println();
        }
    }
}