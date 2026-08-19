import java.util.Scanner;

public class SumOfTwoDArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read rows and columns
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Read matrix
        int[][] matrix = new int[rows][columns];
        int total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
                total += matrix[i][j];
            }
        }
        System.out.println(total);

        // Calculate total of each row
        //for (int i = 0; i < rows; i++) {
          //  int total = 0;

          //  for (int j = 0; j < columns; j++) {
           //     total = total + matrix[i][j];
          //  }

            //System.out.println("Row " + (i + 1) + " total: " + total);
        //}

        sc.close();
    }
}