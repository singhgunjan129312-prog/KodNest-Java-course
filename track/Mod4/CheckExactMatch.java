import java.util.Scanner;

public class CheckExactMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String e1 = scanner.nextLine();
        String e2 = scanner.nextLine();
        System.out.println("Match: " + e1.equals(e2));
        

    }
}