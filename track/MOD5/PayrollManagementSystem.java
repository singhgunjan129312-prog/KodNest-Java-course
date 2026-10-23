abstract class Employee{
    int id;
    String name;
    double salary;
    static String companyName = "KodNest";
    static int count=0;

    public Employee(int id,String name,double salary) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        count++;
    }
    
    abstract double calculateSalary();
    void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        
        System.out.println("Salary: " + calculateSalary());
    }
    static void showRole() {
        System.out.println("Employee Role");
    }
}
class Developer extends Employee {

    Developer(int id,String name,double salary){
        super(id,name,salary);
    }

    @Override
     void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: Developer");
        System.out.println("Salary: " + calculateSalary());
    }
    double calculateSalary() {
        return salary+5000;
    }
    static void showRole() {
        System.out.println("Role: Developer");
    }


}

class Trainer extends Employee {

    Trainer(int id,String name,double salary){
        super(id,name,salary);

    }
     @Override
     void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: Trainer");
        System.out.println("Salary: " + calculateSalary());
    }

    @Override
    double calculateSalary() {
        return salary+3000;
    }
     static void showRole() {
        System.out.println("Role: Trainer");
    }

}
public class PayrollManagementSystem{
    public static void main(String[] args){
        Employee e1 = new Developer(101,"Rahul",40000);
        Employee e2 = new Trainer(102,"Priya",33000);
        System.out.println("Company: " + Employee.companyName);
        e1.displayDetails();
        Developer.showRole();

        e2.displayDetails();
        Trainer.showRole();
        System.out.println("Total Employee: " + Employee.count);
    }
}

