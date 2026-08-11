import java.util.Scanner;

// Learner class defined according to specifications
class Learner {
    int id;
    String name;
    int javaScore;

    // Constructor to initialize fields
    public Learner(int id, String name, int javaScore) {
        this.id = id;
        this.name = name;
        this.javaScore = javaScore;
    }

    // Method to display information in the requested format
    public void printRecord() {
        System.out.println(id + " - " + name + " - " + javaScore);
    }
}

public class LearnerProObjSyt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading first learner's details
        int id1 = scanner.nextInt();
        String name1 = scanner.next();
        int score1 = scanner.nextInt();

        // Reading second learner's details
        int id2 = scanner.nextInt();
        String name2 = scanner.next();
        int score2 = scanner.nextInt();

        // Reading the updated score for the first learner
        int newScore1 = scanner.nextInt();

        // Creating two separate Learner objects
        Learner learner1 = new Learner(id1, name1, score1);
        Learner learner2 = new Learner(id2, name2, score2);

        // Printing records before the update
        System.out.println("Before Update");
        learner1.printRecord();
        learner2.printRecord();

        // Updating only the first learner's Java score
        learner1.javaScore = newScore1;

        // Printing records after the update
        System.out.println("After Update");
        learner1.printRecord();
        learner2.printRecord();

        scanner.close();
    }
}
