import java.util.Scanner;

public class ShowScoreInReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] scores = new int[size];

        // Read all scores into the array
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextInt();
        }

        // Display the scores from last to first
        System.out.print("Reverse scores: ");

        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");
        }

        scanner.close();
    }
}