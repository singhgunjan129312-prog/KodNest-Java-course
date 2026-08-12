import java.util.Scanner;

// 1. Student Class Definition
class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));
    }
}

// 2. Main Class containing execution logic
public class StuMethodFinalChall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user inputs from console
        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create student instance and trigger methods
        Student student = new Student();
        student.setName(name);
        student.showName();
        student.showScore(first);
        student.showScore(first, second);

        scanner.close(); // Best practice to prevent resource leaks
    }
}
