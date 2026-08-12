import java.util.Scanner;

class OrderCalculator {

    int calculateSubtotal(int price, int quantity) {
        return price * quantity;
    }

    int calculateFinalTotal(int subtotal, int deliveryCharge) {
        return subtotal + deliveryCharge;
    }
}

public class FoodOrderDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int price = scanner.nextInt();
        int quantity = scanner.nextInt();
        int deliveryCharge = scanner.nextInt();

        OrderCalculator calculator = new OrderCalculator();

        int subtotal = calculator.calculateSubtotal(price, quantity);

        int finalTotal = calculator.calculateFinalTotal(
                subtotal, deliveryCharge);

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Final Total: " + finalTotal);
    }
}