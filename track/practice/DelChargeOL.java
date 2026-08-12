import java.util.Scanner;

class DeliveryCalculator {

    int calculateCharge(int distance) {
        return distance * 5;
    }

    int calculateCharge(int distance, int expressFee) {
        return distance * 5 + expressFee;
    }
}

public class DelChargeOL {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int distance = scanner.nextInt();
        int expressFee = scanner.nextInt();

        DeliveryCalculator calculator = new DeliveryCalculator();

        int standardCharge = calculator.calculateCharge(distance);
        int expressCharge = calculator.calculateCharge(distance, expressFee);

        System.out.println("Standard Charge: " + standardCharge);
        System.out.println("Express Charge: " + expressCharge);
    }
}