import java.util.*;
abstract class Person {
    int id;
    String name;
    int age;
    public Person(int id,String name,int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void showDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public abstract double calculatePayment();
    public abstract void displayRole();

}
class Student extends Person {
    String course;
    double fee;
    Student(int id,String name,int age,String course,int fee){
        super(id,name,age);
        this.course = course;
        this.fee = fee;
    }
    @Override
    public double calculatePayment() {
        return fee;
    }
    @Override
    public void displayRole() {
        super.showDetails();
        System.out.println("Role: Student");
    }
}
class Professor extends Person {
    String subject;
    double salary;
    Professor(int id, String name, int age, String subject, double salary){
        super(id, name, age);
        this.subject = subject;
        this.salary = salary;
    }
    @Override
    public double calculatePayment() {
        return salary;
    }
    @Override
    public void displayRole(){
        System.out.println("Role: Professor");
    }
    
}
class AdminStaff extends Person{
    String department;
    double salary;
    AdminStaff(int id, String name, int age, String department, double salary){
        super(id, name, age);
        this.department = department;
        this.salary = salary;
    }
    @Override
    public double calculatePayment() {
        return salary;
    }
    @Override
    public void displayRole() {
        System.out.println("Role: Admin Staff");
    }
    
}
public class CollegeManagement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(101,"Rahul",20,"Java",25000);
        Student s2 = new Student(102,"Priya",21,"Python",30000);
        Professor p1 = new Professor(201,"Mahesh",40,"Java",60000);
        Professor p2 = new Professor(202,"Kavya",35,"SQL",55000);
        AdminStaff a = new AdminStaff(301,"Ramesh",32,"IT",35000);
        Person[] arr = {s1,s2,p1,p2,a};
        double totalPayment = 0;
        for(int i = 0;i < arr.length;i++) {
            System.out.println("\n-----------------------");
            arr[i].showDetails();
            arr[i].displayRole();
            double payment = arr[i].calculatePayment();
            System.out.println("Payment: " + payment);
            totalPayment += payment;

        }
        System.out.println("\n=============================");
        System.out.println("Total Payment: " + totalPayment);
    }
}