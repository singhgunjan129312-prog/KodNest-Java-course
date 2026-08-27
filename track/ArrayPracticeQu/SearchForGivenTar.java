import java.util.Scanner;

public class SearchForGivenTar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int tar = sc.nextInt();

        int ind = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] == tar) {
                ind = i;
            }
        }

        System.out.println(ind);
    }
}