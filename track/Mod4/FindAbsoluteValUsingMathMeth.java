import java.util.Scanner;
public class FindAbsoluteValUsingMathMeth{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int abs = Math.abs(a);
        System.out.println("Absolute value: " + abs);
    }
}