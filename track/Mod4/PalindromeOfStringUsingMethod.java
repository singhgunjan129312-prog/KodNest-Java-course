import java.util.Scanner;
public class PalindromeOfStringUsingMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String text = sc.nextLine();
        StringBuilder sb = new StringBuilder(text);
        String rev = sb.reverse().toString();
        System.out.println("Reversed: " + rev);
        System.out.println("Palindrome: " + text.equalsIgnoreCase(rev));

    }
}