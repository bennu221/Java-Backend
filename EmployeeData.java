public class EmployeeData {

    private String empId;
    private String name;
    private double salary;

    public EmployeeData(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Invalid salary");
        }
    }

    public static void main(String[] args) {

        EmployeeData emp = new EmployeeData("EMP101", "Benarji");

        System.out.println("Employee ID: " + emp.getEmpId());

        emp.setName("Bennu");
        System.out.println("Employee Name: " + emp.getName());

        emp.setSalary(35000);
    }
}