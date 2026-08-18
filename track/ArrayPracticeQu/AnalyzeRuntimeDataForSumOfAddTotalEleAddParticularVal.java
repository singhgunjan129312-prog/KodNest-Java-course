import java.util.Scanner;

public class AnalyzeRuntimeDataForSumOfAddTotalEleAddParticularVal{
    public static void main(String[] args) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        
        System.out.print("Enter the Array Element: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter the value: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        
        System.out.println("Total: " + sum);
        
        // Close the scanner resource
        sc.close();
    }
}
