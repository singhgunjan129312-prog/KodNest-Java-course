import java.util.Scanner;

public class FindMaxSumWindowSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int sumV = 0;
        for (int i = 0;i < k;i++) {
            sumV += a[i];
        }
        long max = sumV;
        for (int i = k;i < n;i++) {
            sumV = sumV - a[i - k] + a[i];
            if (sumV > max) {
                max = sumV;
            }
        }
        System.out.println(max);
    }
}