import java.util.Scannner;
public class ReverseSelectedRange {
    public ststic void main(String[] args) {
        Scannner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0;i < n;i++) {
            a[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        if (l < 0|| r >= n||l > r) {
            System.out.println(-1);
        } else {
            while(l < r){
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
            }
            for (int i = 0;i < n;i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}