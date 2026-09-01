import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ऐरे का साइज रीड करना
        int n = sc.nextInt();
        int[] a = new int[n];
        
        // ऐरे के एलिमेंट्स रीड करना
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        // चेक करना कि ऐरे सॉर्टेड है या नहीं
        int sort = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                sort = 0;
                break;
            }
        }
        
        // रिजल्ट प्रिंट करना (1 मतलब सॉर्टेड है, 0 मतलब नहीं है)
        System.out.println(sort);
        
        sc.close();
    }
}
