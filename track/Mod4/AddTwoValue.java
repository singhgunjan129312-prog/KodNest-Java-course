
import java.util.Scanner;

class Calculator {
    static int add(int first,int second) {
        return first+second;
    }
}
public class AddTwoValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + Calculator.add(a,b));
    }
}