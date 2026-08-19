import java.util.Scanner;

public class CinemaSeatAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] seats = new int[rows][columns];

        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seats[i][j] = sc.nextInt();

                if (seats[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);

        sc.close();
    }
}