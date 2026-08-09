import java.util.Scanner;

public class PersnalExpenseCal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read income and expenses
        // Calculate and display the budget details
        double mI = scanner.nextDouble();
        double rE = scanner.nextDouble();
        double fE = scanner.nextDouble();
        double tE = scanner.nextDouble();

        double total = rE + fE + tE;
        double rA = mI - total;

        String status;

        if (rA >= 0) {
            status = "Within budget";
        } else {
            status = "Over budget";
        }

        System.out.println("Total expense: " + total);
        System.out.println("Remaining: " + rA);
        System.out.println("Status: " + status);

        scanner.close();
    }
}