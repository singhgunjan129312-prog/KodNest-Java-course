import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    // Default constructor
    MobilePlan() {
        this.planName = "Basic";
        this.price = 199;
    }

    // Parameterized constructor
    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    // Display method
    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class CreateMobilePlanOverLoadCons {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        // Default constructor
        MobilePlan defaultPlan = new MobilePlan();

        // Parameterized constructor
        MobilePlan selectedPlan = new MobilePlan(planName, price);

        defaultPlan.display();
        selectedPlan.display();

        scanner.close();
    }
}