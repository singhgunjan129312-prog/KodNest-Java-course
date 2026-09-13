import java.util.Scanner;

public class FindEquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
       
        long[] arr = new long[n];
        long totalSum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            totalSum += arr[i];
        }
        
        long leftSum = 0;
        int equilibriumIndex = -1;
        
        // Iterate to find the equilibrium index
        for (int i = 0; i < n; i++) {
            // The right sum is the total sum minus the left sum and the current element
            long rightSum = totalSum - leftSum - arr[i];
            
            if (leftSum == rightSum) {
                equilibriumIndex = i;
                break; 
            }
            
            // Add the current element to the left sum for the next iteration
            leftSum += arr[i];
        }
        
        System.out.println(equilibriumIndex);
        
        sc.close();
    }
}