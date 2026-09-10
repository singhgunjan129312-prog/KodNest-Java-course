import java.util.Scanner;

public class NormalizedSearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String k = scanner.nextLine();
        String s1 = s.trim().toLowerCase();
        String s2 = k.trim().toLowerCase();
        System.out.println("Normalized text: " + s1);
        System.out.println("Contains keyword: " + s1.contains(s2));

    }
}