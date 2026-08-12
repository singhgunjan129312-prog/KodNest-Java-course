import java.util.Scanner;

public class PercentagePra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Exactly one StudentProgress object
        StudentProgress student = new StudentProgress();

        // Read input
        student.name = sc.next();
        student.completedLessons = sc.nextInt();
        student.totalLessons = sc.nextInt();

        // Calculate percentage using integer arithmetic
        student.percentage =
                student.completedLessons * 100 / student.totalLessons;

        // Output
        System.out.println("Student: " + student.name);
        System.out.println("Progress: " + student.completedLessons
                + "/" + student.totalLessons);
        System.out.println("Completion: " + student.percentage + "%");
    }
}