import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String city = scanner.nextLine();

        System.out.println("Name: " + learnerName);
        System.out.println("City: " + city);
        System.out.println("Name length: " + learnerName.length());
    }
}