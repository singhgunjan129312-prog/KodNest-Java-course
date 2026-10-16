import java.util.Scanner;
public class FindMaxWithMath{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a,b);
        System.out.println("Maximum: " + max);
    }
}