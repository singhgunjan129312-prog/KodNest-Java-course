import java.util.Scanner;
public class SuffixSumOfArrEle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++){
            a[i] = sc.nextInt();
        }
        int[] ss = new int[n];
        ss[n-1] = a[n-1];
        for (int i = n-2; i >= 0; i--){
            ss[i] = ss[i+1]+a[i];
        }
        for (int idx = 0; idx < n; idx++){
            System.out.print(ss[idx] + " ");
        }
    }
}