class Employee{
    int id;
    String name;
    void work() {
        System.out.println("Working");
    }
}
public class RefrenceAssiObj{
    public static void main(String[] args) {
    Employee e1=new Employee();
    e1.id=101;
    e1.name="RAm";
    e1.work();
    System.out.println(e1.id);
    System.out.println(e1.name);
    Employee e2;
    e2=e1;
    e2.id=105;
    e2.name="Rani";
    System.out.println(e2.id);
    System.out.println(e2.name);
    

    }
}