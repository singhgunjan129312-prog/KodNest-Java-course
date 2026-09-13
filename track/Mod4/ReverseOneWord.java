import java.util.Scanner;

public class ReverseOneWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        StringBuilder b1 = new StringBuilder(word);
        b1.reverse();
        System.out.println("Reversed: " + b1);

        // Reverse and display the word.
    }
}