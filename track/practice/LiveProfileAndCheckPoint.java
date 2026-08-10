import java.util.Scanner;

class PracticeProfile {
    String name;
    int points;
}

public class LiveProfileAndCheckPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read four values
        String learnerName = sc.next();
        int startingPoints = sc.nextInt();
        int boostPoints = sc.nextInt();
        int correctionPoints = sc.nextInt();

        // Create live object
        PracticeProfile live = new PracticeProfile();
        live.name = learnerName;
        live.points = startingPoints;

        // alias points to the same object
        PracticeProfile alias = live;

        // Add boost through alias
        alias.points = alias.points + boostPoints;

        // Maximum points = 100
        if (alias.points > 100) {
            alias.points = 100;
        }

        // Create independent checkpoint object
        PracticeProfile checkpoint = new PracticeProfile();

        // Copy values before correction
        checkpoint.name = live.name;
        checkpoint.points = live.points;

        // Apply correction to live
        live.points = live.points - correctionPoints;

        // Minimum points = 0
        if (live.points < 0) {
            live.points = 0;
        }

        // Print exactly three lines
        System.out.println("Live: " + live.name + " " + live.points);
        System.out.println("Alias: " + alias.name + " " + alias.points);
        System.out.println("Checkpoint: " + checkpoint.name + " " + checkpoint.points);

        sc.close();
    }
}