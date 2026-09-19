import java.util.Scanner;
class Student {
    String name;
    static int count;
    Student(String name){
        this.name=neme;
        count++;
    }
}
public class CreateTwoStuAndCountThem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        Student s1 = new Student(name1);
        Student s2 = new Student(name2);
        System.out.println("Student: " + s1.name);
        System.out.println("Student: " + s2.name);
        System.out.println("Total students: " + Student.count);

    }
}