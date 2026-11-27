import java.util.*;
public class ArrayDequePro1{

    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add("Anu");
        ad.add("Pooja");
        ad.add("Balu");
        ad.add("Shalu");
        ad.add("Raja");

        System.out.println(ad);
    while(!ad.isEmpty()) {
        System.out.println(ad.poll());
    }
    System.out.println(ad);
    }
}