
public class typeCasting {
    public static void main(String[] args) {

        int solvedProblems = 47;
        double exctPercentage = 86.75;
        int practiceDays = 5;

        // Widening
        double sp = solvedProblems;

        // Narrowing
        int ex = (int) exctPercentage;

        // Average per day
        double aPD = sp / practiceDays;

        // Check target
        boolean dTR = aPD >= 9.0;

        // Output
        System.out.println("Report Value: " + sp);
        System.out.println("Whole Percentage: " + ex);
        System.out.println("Average Per Day: " + aPD);
        System.out.println("Daily Target Reached: " + dTR);
    }
}