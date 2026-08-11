import java.util.Scanner;

class StudentUtility {

    // Print Student Performance Report
    public void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    // Display the student identity
    public void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // Return 60.0
    public double getPassingPercentage() {
        return 60.0;
    }

    // Return the average of the two scores
    public double calculatePercentage(int javaScore, int sqlScore) {
        return (javaScore + sqlScore) / 2.0;
    }
}

public class StuUtilityMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs matching the exact specified order
        int id = scanner.nextInt();
        scanner.nextLine(); // Preserve spaces and clear buffer for full name
        
        String name = scanner.nextLine();
        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        // Rule: Use exactly one StudentUtility object (non-static calls)
        StudentUtility utility = new StudentUtility();

        // Call methods through that single object
        utility.showReportTitle();
        utility.displayStudent(id, name);

        double studentPercentage = utility.calculatePercentage(javaScore, sqlScore);
        double passingPercentage = utility.getPassingPercentage();
        System.out.println("Percentage: " + passingPercentage);

        // Rule: Perform the final decision in main() using the two returned values
        if (studentPercentage >= passingPercentage) {
            System.out.println("PASS");
        } else {
            System.out.println("NEEDS IMPROVEMENT");
        }

        scanner.close();
    }
}