import java.util.Scanner;

public class CheckWhetherArrayIsSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
        int[] a = new int[n];
        
         for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int sort = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                sort = 0;
                break;
            }
        }
        
           System.out.println(sort);
        
        sc.close();
    }
}
