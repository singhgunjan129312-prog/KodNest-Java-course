
import java.util.Scanner;

public class FindMinSumWindowSizeK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return; // Handle empty input gracefully
        int n = scanner.nextInt();
        long[] array = new long[n]; 
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLong();
        }
        int k = scanner.nextInt();

        long currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += array[i];
        }
        
        // Assume the first window has the smallest sum so far
        long minSum = currentSum;

        //  Slide the window across the rest of the array
        for (int i = k; i < n; i++) {
            // Add the new element on the right, remove the old element on the left
            currentSum = currentSum + array[i] - array[i - k];
            
            // Check if this new window's sum is smaller than what we've seen
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }


        System.out.println(minSum);
        
        scanner.close();
    }
}
