import java.util.Scanner;

public class RemoveLastChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder b1 = new StringBuilder(text);
        int ch = b1.length() - 1;
        b1.deleteCharAt(ch);
        System.out.println("Result: " + b1);

      
    }
}