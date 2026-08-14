class Student{
    String name;
    int age;
    double height;
    public Student(String name,int age,double height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public Student(String name){
        this.name=name;
    }
    public Student(){
        this.name="fdjg";
        this.age=20;
        this.height=6.4;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
public class Construct1{
    public static  void main(String[] args){
        Student s1 = new Student("Raja",21,5.5);
        s1.display();
        Student s2 = new Student("Mohan");
        s2.display();
        Student s3=new Student();
        s3.display();
    }
}