import java.util.Scanner;
class Learner {
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public void displayAge() {
        System.out.println(age);
    }
}
public class ProtectLearnerAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Learner l = new Learner();
        l.setAge(age);
        l.displayAge();
    }
}