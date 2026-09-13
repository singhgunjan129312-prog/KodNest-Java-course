import java.util.Scanner;

public class FindOneRepeatAndMissingVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read size of the array
        int n = sc.nextInt();
        
        // Use a frequency array of size n + 1 (to track numbers 1 to n)
        int[] freq = new int[n + 1];
        
        // Read the array elements and update their frequencies
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            freq[val]++;
        }
        
        int rep = -1;
        int mis = -1;
        
        // Find the repeating and missing values
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) {
                rep = i; // The number that appears twice
            } else if (freq[i] == 0) {
                mis = i; // The number that never appeared
            }
        }
        
        // Print repeating value first, then missing value
        System.out.println(rep + " " + mis);
        
        sc.close();
    }
}