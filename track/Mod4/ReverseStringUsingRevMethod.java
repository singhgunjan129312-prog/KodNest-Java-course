import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder n = new StringBuilder(text);
        System.out.println("Reversed: " + n.reverse());
        

    }
}
