import java.util.Scanner;

public class CheckExactPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();
        StringBuilder b1 = new StringBuilder(word);
        String rev = b1.reverse().toString();
        System.out.println("Palindrome: " + word.equals(rev));

    }
}