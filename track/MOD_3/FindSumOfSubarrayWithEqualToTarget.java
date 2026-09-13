import java.util.Scanner;

public class FindSumOfSubarrayWithEqualToTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
 
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        
        long target = scanner.nextLong();
        
        // Sliding window approach
        int left = 0;
        long currentSum = 0;
        
        for (int right = 0; right < n; right++) {
            currentSum += arr[right]; // Expand window to the right
            
            // Shrink window from the left if the sum exceeds the target
            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }
            
            // Check if the target is found and the window is non-empty
            if (currentSum == target && left <= right) {
                System.out.println(left + " " + right);
                return;
            }
        }
        
        // No valid subarray found
        System.out.println("-1");
    }
}