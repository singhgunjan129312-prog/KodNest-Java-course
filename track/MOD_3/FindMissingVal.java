import java.util.Scanner;

public class FindMissingVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
      
        for (int i = 1;i < n;i++) {

            a[i] = sc.nextInt();
            
        }
        
        int sum = n * (n + 1) / 2;
        for (int i = 1;i < n;i++) {
            sum -= a[i];
        }
        System.out.println(sum);

    }
}
