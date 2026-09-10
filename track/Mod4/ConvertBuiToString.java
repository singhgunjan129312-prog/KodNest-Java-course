import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder builder = new StringBuilder(text);
        builder.append("!");
        String res =  builder.toString();
        System.out.println("Builder: " + builder);
        System.out.println("String: " + res);

    }
}