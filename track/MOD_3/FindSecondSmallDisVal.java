import java.util.Scanner;

public class FindSecondSmallDisVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int small = Integer.MAX_VALUE;
        int secoS = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] < small) {
                secoS = small;
                small = a[i];
            } else if (a[i] < secoS && a[i] != small) {
                secoS = a[i];
            }
        }
                if (secoS == Integer.MAX_VALUE) {
            System.out.println("No second smallest distinct value");
        } else {
            System.out.println(secoS);
        }
        
        sc.close();
    }
}
