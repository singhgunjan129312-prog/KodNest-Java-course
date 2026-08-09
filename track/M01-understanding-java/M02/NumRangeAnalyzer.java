import java.util.Scanner;

public class NumRangeAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the range and analyze even and odd numbers
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int eS = 0;
        int oC = 0;

        int num = start;

        if (start <= end) {
            while (num <= end) {

                if (num % 2 == 0) {
                    eS += num;
                } else {
                    oC += 1;
                }

                num++;
            }
        }

        System.out.println("Even sum: " + eS);
        System.out.println("Odd count: " + oC);

        scanner.close();
    }
}