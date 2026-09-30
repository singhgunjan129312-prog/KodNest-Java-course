import java.util.Scanner;

class Student {
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public void displayAge() {
        System.out.println(age);
    }

    // Create setAge()
    // Create displayAge()
}

public class ProtectStudentAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Student s = new Student();
        s.setAge(age);
        s.displayAge();

        // Complete the program
    }
}