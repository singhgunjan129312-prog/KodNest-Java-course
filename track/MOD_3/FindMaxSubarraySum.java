import java.util.Scanner;

public class FindMaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        
        long bestSum = Long.MIN_VALUE;
        long currentSum = 0;
        
        for (int i = 0; i < n; i++) {
            long val = scanner.nextLong();
            
            currentSum = Math.max(val, currentSum + val);
          
            bestSum = Math.max(bestSum, currentSum);
        }
        
        System.out.println(bestSum);
        
        scanner.close();
    }
}