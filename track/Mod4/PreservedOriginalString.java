import java.util.Scanner;

public class PreservedOriginalString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String o = scanner.nextLine();
        String res = o.toLowerCase();
        System.out.println("Original: " + o);
        System.out.println("Lowercase copy: " + res);

    }
}
