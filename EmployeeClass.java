class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() * 1.20;
    }
}

class Developer extends Employee {

    Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return super.calculateSalary() * 1.10 + 5000;
    }
}

public class EmployeeClass {
    public static void main(String[] args) {

        Employee emp = new Employee("Ravi", 30000);
        Manager mgr = new Manager("Kiran", 50000);
        Developer dev = new Developer("Anu", 40000);

        System.out.println(emp.name + " Salary: " + emp.calculateSalary());
        System.out.println(mgr.name + " Salary: " + mgr.calculateSalary());
        System.out.println(dev.name + " Salary: " + dev.calculateSalary());
    }
}