import java.util.Scanner;

public class AddPrifixWithInsertMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();
        StringBuilder b1 = new StringBuilder(baseText);
        b1.insert(0,prefix + " ");
        System.out.println("Result: " + b1);


     
    }
}