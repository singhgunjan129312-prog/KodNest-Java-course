import java.util.Scanner;

class Product {
    private double price;

    Product(double price) {
       
        this.price = price;
    }
    public void getPrice() {
        System.out.println(price);
    }


}

public class ReadPrivateDataWithGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pr = sc.nextDouble();
        Product p = new Product(pr);
        p.getPrice();

        
    }
}