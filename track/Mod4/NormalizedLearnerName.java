import java.util.Scanner;

public class NormalizedLearnerName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        String n = l.trim().toUpperCase();
        System.out.println("Normalized name: " + n);

    }
}
