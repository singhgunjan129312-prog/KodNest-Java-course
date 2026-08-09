import java.util.Scanner;

public class UsingLoopCondByUserInp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        // Calculate the total and display the progress status
        int day = scanner.nextInt();
        int total = 0;

        for (int i = 1; i <= day; i++) {
            int daySolvedPr = scanner.nextInt();
            total += daySolvedPr;
        }

        String status;

        if (total >= 20) {
            status = "Strong progress";
        } else if (total >= 10 && total <= 19) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        System.out.println("Total solved: " + total);
        System.out.println("Status: " + status);

        scanner.close();
    }
}