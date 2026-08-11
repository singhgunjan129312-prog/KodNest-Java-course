import java.util.Scanner;

// --- From Image 1 ---
class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

// --- From Image 2 ---
public class StoreUsingThis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Student student = new Student();
        student.setName(name);
        student.displayName();
    }
}
