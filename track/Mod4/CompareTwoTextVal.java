import java.util.Scanner;

public class CompareTwoTextVal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String f = scanner.nextLine();
        String s = scanner.nextLine();

        boolean sf = f.equals(s);
        boolean er = f.equalsIgnoreCase(s);

        System.out.println("Exact match: " + sf);
        System.out.println("Ignore-case match: " + er);
    }
}