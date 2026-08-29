import java.util.Scanner;

class SalesAnalyzer {

    double[] dailySales;

    public SalesAnalyzer(double[] dailySales) {
        this.dailySales = dailySales;
    }

    double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < dailySales.length; i++) {
            total += dailySales[i];
        }
        return total;
    }

    double calculateAverage() {
        double total = calculateTotal();
        double average = total / dailySales.length;
        return average;
    }

  
    int findHighestSalesDay() {
        if (dailySales.length == 0) return 0;
        
        int highestDayIndex = 0;
        double maxSales = dailySales[0];
        
        for (int i = 1; i < dailySales.length; i++) {

            if (dailySales[i] > maxSales) {
                maxSales = dailySales[i];
                highestDayIndex = i;
            }
        }
        return highestDayIndex + 1; 
    }


    int findLowestSalesDay() {
        if (dailySales.length == 0) return 0;
        
        int lowestDayIndex = 0;
        double minSales = dailySales[0];
        
        for (int i = 1; i < dailySales.length; i++) {
        
            if (dailySales[i] < minSales) {
                minSales = dailySales[i];
                lowestDayIndex = i;
            }
        }
        return lowestDayIndex + 1;
    }

    int countAboveAverageDays() {
        double average = calculateAverage();
        int count = 0;
        
        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > average) {
                count++;
            }
        }
        return count;
    }

    void displayReport() {
        int highestDay = findHighestSalesDay();
        int lowestDay = findLowestSalesDay();
        
        System.out.println("Number of Days: " + dailySales.length);
        System.out.println("Total Sales: " + calculateTotal());
        System.out.println("Average Sales: " + calculateAverage());
        System.out.println("Highest Sales Day: " + highestDay);
        System.out.println("Highest Sales: " + dailySales[highestDay - 1]);
        System.out.println("Lowest Sales Day: " + lowestDay);
        System.out.println("Lowest Sales: " + dailySales[lowestDay - 1]);
        System.out.println("Days Above Average: " + countAboveAverageDays());
    }
}

public class DailySalesAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = scanner.nextInt();

        double[] salesData = new double[numberOfDays];

        for (int i = 0; i < numberOfDays; i++) {
            salesData[i] = scanner.nextDouble();
        }

        SalesAnalyzer analyzer = new SalesAnalyzer(salesData);

        analyzer.displayReport();

        scanner.close();
    }
}
