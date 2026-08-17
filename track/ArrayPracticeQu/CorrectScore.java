import java.util.Scanner;

class ScoreEditor {

    void correctScore(int[] scores, int index, int newScore) {
        if (index >= 0 && index < scores.length) {
            scores[index] = newScore;
        } else {
            System.out.println("Invalid index");
        }
    }

    void displayScores(int[] scores) {
        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        System.out.println();
    }
}

public class CorrectScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] scores = new int[size];

        for (int index = 0; index < scores.length; index++) {
            scores[index] = scanner.nextInt();
        }

        int correctionIndex = scanner.nextInt();
        int newScore = scanner.nextInt();

        ScoreEditor e1 = new ScoreEditor();

        e1.correctScore(scores, correctionIndex, newScore);
        e1.displayScores(scores);

        scanner.close();
    }
}