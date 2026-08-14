import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    // Constructor with only item
    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    // Overloaded constructor with item and quantity
    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    // Display method
    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class CreatingFoodOrderOverLoadingCons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item = sc.nextLine();
        int quantity = sc.nextInt();

        // Order using only item
        FoodOrder order1 = new FoodOrder(item);

        // Order using item and quantity
        FoodOrder order2 = new FoodOrder(item, quantity);

        order1.display();
        order2.display();

        sc.close();
    }
}