import java.util.Scanner;

public class FindMaxToConsctiveVal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int max = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (a[i] == 1) {
                count++;

                if (count > max) {
                    max = count;
                }
            } 
            else {
                count = 0;
            }
        }

        System.out.println(max);
    }
}