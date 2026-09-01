import java.util.Scanner;

public class FindFirstAndLastInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int tar = sc.nextInt();
        int first = -1;
        int last = -1;
        
        for (int i = 0; i < n; i++) {
            if (a[i] == tar) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
    
        System.out.println(first + " " + last);
        
        sc.close();
    }
}
