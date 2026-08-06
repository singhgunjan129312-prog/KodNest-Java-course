public class PlacementRegarding2 {
    public static void main(String[] args) {
        int total = 0;

        for (int number = 1; number <= 5; number++) {
            if (number == 3)
                continue;

            System.out.println("Number: " + number);
            total += number;
        }

        System.out.println("Total: " + total);
    }
}