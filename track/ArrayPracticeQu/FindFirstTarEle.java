import java.util.Scanner;

public class FindFirstTarEle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int tar = scanner.nextInt();

        int index = -1;   // assume target is not found

        for (int i = 0; i < size; i++) {
            if (numbers[i] == tar) {
                index = i;
                break;
            }
        }

        System.out.println("First index: " + index);
    }
}