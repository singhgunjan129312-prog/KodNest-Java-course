import java.util.Scanner;
class Student {
    static int count;

    Student() {
        count++;
    }
    
}
public class CountNoOfObj{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStu = sc.nextInt();
        for(int i = 1;i<= noOfStu;i++) {
            new Student();
        }
        System.out.println("Created students: " + Student.count);
    }
}