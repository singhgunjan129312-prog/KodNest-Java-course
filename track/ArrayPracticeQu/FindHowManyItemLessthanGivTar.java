public class FindHowManyItemLessthanGivTar {
    public static void main(String[] args) {

        int[] stock = {4, 12, 2, 9, 5};
        int reLe = 5;
        int count = 0;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] <= reLe) {
                count++;
            }
        }

        System.out.println("Items to reorder: " + count);
    }
}