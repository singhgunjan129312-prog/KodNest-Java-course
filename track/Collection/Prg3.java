import java.util.*;
public class Prg3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter the Element: ");
        for(int i = 1;i <= n;i++) {
            int element = sc.nextInt();
            al.add(element);
        }
        System.out.print("ArrayList: " + al);
        System.out.println();
        System.out.println("Traverse using For Loop");
        for(int i = 0;i <= al.size()-1;i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();
        System.out.println("Traversing using Advance for loop");


        for(Object x:al){
            System.out.print(x + " ");
        }
    }
}