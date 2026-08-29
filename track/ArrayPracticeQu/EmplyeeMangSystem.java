import java.util.Scanner;

class Employee {
    // Instance Variables
    int employeeId;
    String employeeName;
    double basicSalary;
    double bonus;

    // Zero-Parameter Constructor
    public Employee() {
        this.employeeId = 0;
        this.employeeName = "";
        this.basicSalary = 0.0;
        this.bonus = 0.0;
    }

    // Parameterized Constructor
    public Employee(int employeeId, String employeeName, double basicSalary, double bonus) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Method 1: Set Employee Details
    public void setEmployeeDetails(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.bonus = 0.0;
    }

    // Method 2: Add Fixed Bonus
    public void addBonus(double bonusAmount) {
        this.bonus += bonusAmount;
    }

    // Method 3: Add Percentage Bonus
    public void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = this.basicSalary * bonusPercentage / 100;
        double additionalBonus = percentageBonus + extraReward;
        this.bonus += additionalBonus;
    }

    // Method 4: Calculate Total Salary
    public double calculateTotalSalary() {
        double totalSalary = this.basicSalary + this.bonus;
        return totalSalary;
    }

    // Method 5: Display Employee
    public void displayEmployee() {
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Total Salary: " + this.calculateTotalSalary());
    }
}

public class EmplyeeMangSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1. Read First Employee Input Sequence ---
        int id1 = scanner.nextInt();
        scanner.nextLine(); // Consume newline buffer to allow multi-word names
        String name1 = scanner.nextLine();
        double salary1 = scanner.nextDouble();
        double fixedBonus1 = scanner.nextDouble();

        // Initialize Employee 1 via Zero-Parameter Constructor
        Employee emp1 = new Employee();
        emp1.setEmployeeDetails(id1, name1, salary1);
        emp1.addBonus(fixedBonus1);

        // --- 2. Read Second Employee Input Sequence ---
        int id2 = scanner.nextInt();
        scanner.nextLine(); // Consume newline buffer
        String name2 = scanner.nextLine();
        double salary2 = scanner.nextDouble();
        double initialBonus2 = scanner.nextDouble();
        double bonusPercentage2 = scanner.nextDouble();
        double extraReward2 = scanner.nextDouble();

        // Initialize Employee 2 via Parameterized Constructor
        Employee emp2 = new Employee(id2, name2, salary2, initialBonus2);
        emp2.addBonus(bonusPercentage2, extraReward2);

        // --- 3. Print Results in Exact Sample Output Format ---
        System.out.println("Employee 1");
        emp1.displayEmployee();
        
        System.out.println(); // Prints the blank structural line shown in sample output
        
        System.out.println("Employee 2");
        emp2.displayEmployee();

        scanner.close();
    }
}
