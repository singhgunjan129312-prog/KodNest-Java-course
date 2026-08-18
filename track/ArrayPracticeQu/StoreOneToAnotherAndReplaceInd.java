public class StoreOneToAnotherAndReplaceInd {
    public static void main(String[] args) {

        int[] read = {12, 14, 16, 18};
        int up = 2;
        int nev = 25;

        int[] snap = new int[read.length];

        for (int i = 0; i < snap.length; i++) {
            snap[i] = read[i];
        }

        System.out.print("Snapshot: ");

        for (int i = 0; i < snap.length; i++) {
            System.out.print(snap[i] + " ");
        }

        System.out.println();

        if (up >= 0 && up < snap.length) {
            snap[up] = nev;
        }

        System.out.print("Updated: ");

        for (int i = 0; i < snap.length; i++) {
            System.out.print(snap[i] + " ");
        }

        System.out.println();
    }
}