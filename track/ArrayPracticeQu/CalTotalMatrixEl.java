import java.util.Scanner;

public class CalTotalMatrixEl{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int total = 0;
            for (int j = 0; j < columns; j++) {
                total += matrix[i][j];
            }
            
            System.out.println("Row " + (i + 1) + " total: " + total);
        }
        sc.close();
    }
}