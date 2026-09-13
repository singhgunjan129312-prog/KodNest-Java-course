import java.util.Scanner;

public class ReplaceFirstChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char replacement = scanner.nextLine().charAt(0);
        StringBuilder b1 = new StringBuilder(text);
        b1.setCharAt(0,replacement);
        System.out.println("Result: " + b1);


    }
}