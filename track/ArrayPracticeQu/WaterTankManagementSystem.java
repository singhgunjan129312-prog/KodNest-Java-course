import java.util.Scanner;

class WaterTank {gcxf
    int capacity;
    int currentLevel;

   
    public WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int availableSpace = capacity - currentLevel;
        int actualAdded = (amount <= availableSpace) ? amount : availableSpace;
        currentLevel += actualAdded;
        return actualAdded;
    }

    public int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int actualRemoved = (amount <= currentLevel) ? amount : currentLevel;
        currentLevel -= actualRemoved;
        return actualRemoved;
    }

   
    public String getStatus() {
        if (currentLevel == 0) {
            return "Empty";
        }
        
        double fillPercentage = currentLevel * 100.0 / capacity;
        
        if (fillPercentage > 0 && fillPercentage <= 25) {
            return "Low";
        } else if (fillPercentage > 25 && fillPercentage <= 75) {
            return "Medium";
        } else if (fillPercentage > 75 && fillPercentage < 100) {
            return "High";
        } else {
            return "Full";
        }
    }

    public void displayTank() {
        System.out.println("Capacity: " + capacity);
        System.out.println("Current level: " + currentLevel);
        System.out.println("Available space: " + (capacity - currentLevel));
        System.out.println("Tank status: " + getStatus());
    }
}

public class WaterTankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        int initialLevel = sc.nextInt();
        int totalOperations = sc.nextInt();

        WaterTank tank = new WaterTank(capacity, initialLevel);

        for (int i = 0; i < totalOperations; i++) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    int fillAmount = sc.nextInt();
                    int added = tank.fillWater(fillAmount);
                    System.out.println(added);
                    break;

                case 2:
                    int drainAmount = sc.nextInt();
                    int removed = tank.drainWater(drainAmount);
                    System.out.println(removed);
                    break;

                case 3: 
                    tank.displayTank();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
        
        System.out.println(tank.getStatus());
        
        sc.close();
    }
}
