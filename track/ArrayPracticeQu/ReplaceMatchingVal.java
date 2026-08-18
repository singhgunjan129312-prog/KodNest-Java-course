import java.util.Scanner;

public class ReplaceMatchingVal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int replacement = scanner.nextInt();
        int changes = 0;

        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == target) {
                numbers[index] = replacement;
                changes++;
            }
        }

        System.out.println("Changes: " + changes);
        System.out.print("Updated array:");

        for (int index = 0; index < numbers.length; index++) {
            System.out.print(" " + numbers[index]);
        }

        System.out.println();
        scanner.close();
    }
}