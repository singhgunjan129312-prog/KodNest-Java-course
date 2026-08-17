import java.util.Scanner;

public class ComparePracticePlan {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] planned = new int[n];
        int[] completed = new int[n];

        
        for (int i = 0; i < n; i++) {
            planned[i] = sc.nextInt();
        }

    
        for (int i = 0; i < n; i++) {
            completed[i] = sc.nextInt();
        }

        int completedDays = 0;

        
        for (int i = 0; i < n; i++) {
            if (completed[i] >= planned[i]) {
                System.out.println("Day " + (i + 1) + ": Completed");
                completedDays++;
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");
            }
        }

        System.out.println("Completed days: " + completedDays);

        sc.close();
    }
}