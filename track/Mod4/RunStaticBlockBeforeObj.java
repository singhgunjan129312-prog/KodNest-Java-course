import java.util.Scanner;
class Course{
    static{
        System.out.println("Course class initialized");
    }
    Course(String name){
        System.out.println("Created: " + name);
    }
}
public class RunStaticBlockBeforeObj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        
        Course c1 = new Course(name1);
        
    }
}