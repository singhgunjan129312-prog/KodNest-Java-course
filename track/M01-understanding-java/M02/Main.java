class Student {
    String name;
    int age;
    double height;
    void run(){
        System.out.println("Running");
    }
    void sleep(){
        System.out.println("Sleeping");
    }
}
public class Main{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="ram";
        s1.age=21;
        s1.height=5.5;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();
    }
}