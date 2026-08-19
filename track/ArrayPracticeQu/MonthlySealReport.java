import java.util.Scanner;

public class MonthlySealReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pro = sc.nextInt();
        int mo = sc.nextInt();

        int[][] sales = new int[pro][mo];
        for (int i = 0;i < pro;i++) {
            for (int j = 0;j < mo;j++) {
                sales[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < pro; i++) {
            int total = 0;

            for (int j = 0; j < mo; j++) {
                
                total += sales[i][j];
            }

            System.out.println("Product " + (i + 1) + " total: " + total);
        }

        sc.close();
    }
}