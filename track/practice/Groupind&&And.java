import java.util.Scanner;

public class Grouping&&And {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int codingScore = scanner.nextInt();
        int attendance = scanner.nextInt();
        int projects = scanner.nextInt();

        boolean eligible = codingScore >= 60
                && (attendance >= 75 || projects >= 2);

        if (eligible) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        scanner.close();
    }
}