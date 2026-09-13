import java.util.Scanner;

public class BuildGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();
        StringBuilder b1 = new StringBuilder();
        b1.append("Hello, ");

        b1.append(learnerName);
        b1.append("!");
        System.out.println(b1);


   
    }
}
