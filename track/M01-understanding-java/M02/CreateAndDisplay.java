import java.util.Scanner;

class Student {
    int id;
    String name;
    String course;
    double javaScore;
}

public class CreateAndDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create one Student object
        Student s1 = new Student();

        // Read and store all values in the object
        s1.id = scanner.nextInt();
        scanner.nextLine();
        s1.name = scanner.nextLine();
        s1.course = scanner.nextLine();
        s1.javaScore = scanner.nextDouble();

        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);

        scanner.close();
    }
}