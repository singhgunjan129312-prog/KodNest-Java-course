public class Main1{
    public static void main(String[] args) {

        int month = 1;
        // do while loop use for monthly financial report
        do {

            // declare all the money expenses values for each month
            double monthlyIncomes;
            double homeContributionMon;
            double perMonRent;
            double foodExpenses;
            double travelExpenses;
            double educationExpenses;
            double otherExpenses;
        // use if else statement for monthly income
            if (month == 1) {
                monthlyIncomes = 70000;
                homeContributionMon = 10000;
                perMonRent = 15000;
                foodExpenses = 8000;
                travelExpenses = 5000;
                educationExpenses = 7000;
                otherExpenses = 5000;
            } else {
                monthlyIncomes = 65000;
                homeContributionMon = 9000;
                perMonRent = 14000;
                foodExpenses = 7500;
                travelExpenses = 4500;
                educationExpenses = 6000;
                otherExpenses = 4000;
            }

            // Calculations all the final values of personal expenses & saving analyser
            double totalExpenses = homeContributionMon + perMonRent + foodExpenses
                    + travelExpenses + educationExpenses + otherExpenses;

            double savings = monthlyIncomes - totalExpenses;

            double expensePercentage = (totalExpenses / monthlyIncomes) * 100.0;
            double savingsPercentage = (savings / monthlyIncomes) * 100.0;

            // Type Casting
            int roundedSavings = (int) savings;

            // Relational and Logical Operators
            boolean expensesExceedIncome = ( totalExpenses > monthlyIncomes );
            boolean positiveSavings = ( savings > 0 && !expensesExceedIncome );

            // Financial Category (using decision making)
            String category;

            if (savingsPercentage < 10) {
                category = "Critical";
            } else if (savingsPercentage < 20) {
                category = "Needs Improvement";
            } else if (savingsPercentage < 30) {
                category = "Good";
            } else {
                category = "Excellent";
            }

            // Ternary Operator
            String message = positiveSavings
                    ? "Savings are healthy but can be improved."
                    : "Expenses are higher than income. Reduce spending.";

            // Output
            System.out.println("==================================");
            System.out.println("MONTHLY FINANCIAL REPORT - Month " + month);
            System.out.println("==================================");

            System.out.println("Monthly Income : " + monthlyIncomes);
            System.out.println("Home Contribution : " + homeContributionMon);
            System.out.println("Rent : " + perMonRent);
            System.out.println("Food Expenses : " + foodExpenses);
            System.out.println("Travel Expenses : " + travelExpenses);
            System.out.println("Education Expenses : " + educationExpenses);
            System.out.println("Other Expenses : " + otherExpenses);

            System.out.println("\nTotal Expenses : " + totalExpenses);
            System.out.println("Remaining Amount : " + savings);
            System.out.println("Rounded Savings : " + roundedSavings);

            System.out.printf("Expense Percentage : %.2f%%\n", expensePercentage);
            System.out.printf("Savings Percentage : %.2f%%\n", savingsPercentage);

            System.out.println("Expenses Exceed Income : " + expensesExceedIncome);
            System.out.println("Financial Category : " + category);
            System.out.println("Message : " + message);

            month++;   // Assignment Operator

        } while (month <= 2);

    }
}