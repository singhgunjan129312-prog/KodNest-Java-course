import java.util.Scanner;

public class BuildSymbolLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);
        int repeatCount = Integer.parseInt(scanner.nextLine());

        StringBuilder builder = new StringBuilder();
        for (int i = 0;i < repeatCount;i++) {
            builder.append(symbol);
        }

        System.out.println("Result: " + builder);
    }
}