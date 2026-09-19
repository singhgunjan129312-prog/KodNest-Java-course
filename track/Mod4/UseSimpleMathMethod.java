
import java.util.Scanner;

public class UseSimpleMathMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int pos= Math(a);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Absolute first: " + pos);
    }
}