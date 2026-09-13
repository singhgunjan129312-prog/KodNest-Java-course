import java.util.Scanner;

public class MulRangeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
        }
        long[] pre = new long[n];
        pre[0] = a[0];
        for (int i = 1;i < n;i++) {
            pre[i] = pre[i - 1] + a[i];
        }
        int m = sc.nextInt();
        
        for (int j = 0;j < m;j++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            long sum ;
            if (l == 0) {
                sum = pre[r];
            } else {
                sum = pre[r] - pre[l - 1];
            }
            System.out.println(sum);
        }
    }
}