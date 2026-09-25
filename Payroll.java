class Employee1 {
    String name;
    int id;

    Employee1(String name, int id) {
        this.name = name;
        this.id = id;
    }

    double calculatePay() {
        return 0;
    }
}

class SalariedEmployee extends Employee1 {
    double monthlySalary;

    SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePay() {
        return monthlySalary;
    }
}

class HourlyEmployee extends Employee1 {
    double hourlyRate;
    int hoursWorked;

    HourlyEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyRate;
        } else {
            return (40 * hourlyRate) + ((hoursWorked - 40) * hourlyRate * 1.5);
        }
    }
}
class CommissionEmployee extends Employee1 {
    double sales;
    double commissionRate;

    CommissionEmployee(String name, int id, double sales, double commissionRate) {
        super(name, id);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    double calculatePay() {
        return sales * commissionRate;
    }
}

public class Payroll {

    static void processPayroll(Employee1[] staff) {
        double total = 0;

        for (Employee1 e : staff) {
            System.out.println(e.name + " : " + e.calculatePay());
            total += e.calculatePay();
        }

        System.out.println("Total Payout = ₹" + total);
    }

    public static void main(String[] args) {

        Employee1[] staff = {
            new SalariedEmployee("Ravi", 101, 50000),
            new HourlyEmployee("Anu", 102, 500, 45),
            new CommissionEmployee("Kiran", 103, 200000, 0.10),
            new SalariedEmployee("Priya", 104, 45000),
            new HourlyEmployee("Rahul", 105, 400, 38)
        };

        processPayroll(staff);
    }
}