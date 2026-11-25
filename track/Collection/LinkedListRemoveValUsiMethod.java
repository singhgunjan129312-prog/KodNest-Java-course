import java.util.*;

public class LinkedListRemoveValUsiMethod {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(30);
        ll.add(20);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);
        ll.remove(0) ;//Using With index
        System.out.println(ll);
        System.out.println(ll.remove(Integer.valueOf(40)));//Using With Valuent));
        System.out.println(ll);
    }
}