import java.util.Scanner;

public class ConvertBuilderIntoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder b1 = new StringBuilder(text);
        String s = b1.toString();
        System.out.println("String: " + s);

    }
}