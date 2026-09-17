public class Employee{
    String empId;
    String name;
    double salary;

    Employee(String empId, String name,double salary){
        if(empId.startsWith("EMP") && salary > 0) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }else{
            System.out.println("Invalid Data");
            this.empId = "EMP000";
            this.name = "Invalid";
            this.salary = 0;
        }
    }
    void display(){
        System.out.println(empId+" " + name+" "+salary);
    }
    public static void main(String[] args){
        Employee e1 = new Employee("EMP1234","Benarji",25000);
        Employee e2 = new Employee("ABC1234","Uday",30000);
    
        e1.display();
        e2.display();
    
    }
}