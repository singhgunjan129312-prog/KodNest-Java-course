import java.util.Scanner;

class Product {
    private double price;

    public boolean setPrice(double price) {
        if (price >= 0) {
            this.price = price;
            return true;
        }
        return false;
    }

    public double getPrice() {
        // Return price
        return price;
    }
}

public class ValidateProductPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pr = sc.nextDouble();
        Product p = new Product();
        p.setPrice(pr);
        double ans = p.getPrice();
        if (pr >= 0) {
            System.out.println(p.getPrice());
        } else {
            System.out.println("Invalid price");
        }

        // Complete the program
    }
}