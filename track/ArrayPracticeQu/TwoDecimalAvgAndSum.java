import java.util.Scanner;

public class TwoDecimalAvgAndSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];
        }

        double t = sum;
        double avg = t / n;

        System.out.println(sum);
        System.out.printf("%.2f%n", avg);
    }
}