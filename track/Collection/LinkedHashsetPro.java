import java.util.*;
public class LinkedHashsetPro {
    public static void main(String[] args) {
     LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(10);
        lhs.add(20);
        lhs.add(55);
        lhs.add(999);
        lhs.add(10);
        lhs.add(20);
        System.out.println(lhs);
        

        LinkedHashSet lhs2 = new LinkedHashSet();
        lhs2.add("Anu");
        lhs2.add("Raju");
        lhs2.add("Zooni");
        lhs2.add("Yuva");

        System.out.println(lhs2);
    }
}