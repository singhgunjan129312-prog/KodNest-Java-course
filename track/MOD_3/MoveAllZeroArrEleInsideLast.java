import java.util.Scanner;

public class MoveAllZeroArrEleInsideLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        

        int writeIdx = 0;
        for (int readIdx = 0; readIdx < n; readIdx++) {
            if (a[readIdx] != 0) {
                a[writeIdx] = a[readIdx];
                writeIdx++;
            }
        }
        
        while (writeIdx < n) {
            a[writeIdx] = 0;
            writeIdx++;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        
        sc.close();


    }
}
