import java.util.Scanner;

class WaterTank {

    int capacity;
    int currentLevel;

    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }

        int availableSpace = capacity - currentLevel;

        if (amount <= availableSpace) {
            currentLevel = currentLevel + amount;
            return amount;
        } else {
            // टैंक की क्षमता से ज़्यादा होने पर केवल बची हुई जगह ही भरेगा
            int actualAmount = availableSpace;
            currentLevel = capacity;
            return actualAmount;
        }
    }

    int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }

        if (amount <= currentLevel) {
            currentLevel = currentLevel - amount;
            return amount;
        } else {
            // टैंक में मौजूद पानी से ज़्यादा निकालने पर केवल उपलब्ध पानी ही बाहर आएगा
            int actualAmount = currentLevel;
            currentLevel = 0;
            return actualAmount;
        }
    }

    String getStatus() {
        if (currentLevel == 0) {
            return "Empty";
        } else if (currentLevel == capacity) {
            return "Full";
        } else {
            // निर्देशानुसार लोकल वेरिएबल का नाम fillPercentage रखा गया है
            double fillPercentage = (currentLevel * 100.0) / capacity;

            if (fillPercentage <= 25) {
                return "Low";
            } else if (fillPercentage <= 75) {
                return "Medium";
            } else {
                return "High";
            }
        }
    }

    void displayTank() {
        int availableSpace = capacity - currentLevel;

        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Available Space: " + availableSpace);
        System.out.println("Status: " + getStatus());
    }
}

public class WaterTankManagementSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = scanner.nextInt();
        int currentLevel = scanner.nextInt();
        int numberOfOperations = scanner.nextInt();

        WaterTank tank = new WaterTank(capacity, currentLevel);

        for (int i = 1; i <= numberOfOperations; i++) {

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    int fillAmount = scanner.nextInt();
                    int filled = tank.fillWater(fillAmount);
                    System.out.println("Operation " + i + " - Filled: " + filled);
                    break;

                case 2:
                    int drainAmount = scanner.nextInt();
                    int drained = tank.drainWater(drainAmount);
                    System.out.println("Operation " + i + " - Drained: " + drained);
                    break;

                case 3:
                    System.out.println("Operation " + i + " - Tank Status");
                    tank.displayTank();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        // लूप खत्म होने के बाद का फाइनल स्टेटस ब्लॉक जो नीचे 'Status: Empty' भी दिखाएगा
        System.out.println("Final Tank Status");
        tank.displayTank();

        scanner.close();
    }
}
