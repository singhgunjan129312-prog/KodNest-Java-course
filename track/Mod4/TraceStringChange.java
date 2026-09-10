import java.util.Scanner;

public class TraceStringChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String o = scanner.nextLine();
        System.out.println("Original: " + o);
        o.toUpperCase();
    
        String res = o.toUpperCase();
        System.out.println("After ignored call: " + o);
        System.out.println("Uppercase copy: " + res);

    }
}