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
        Student s2=new Student();
        s2.name="raja";
        s2.age=23;
        s2.height=4.5;
        System.out.println(s2.name);
        System.out.println(s2.age);
        System.out.println(s2.height);
        s2.run();
        s2.sleep();
    }
}