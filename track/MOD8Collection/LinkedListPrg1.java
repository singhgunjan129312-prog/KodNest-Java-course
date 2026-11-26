import java.util.*;

public class LinkedListPrg1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);

        ll.addFirst(99);
        System.out.println(ll);
    }
}