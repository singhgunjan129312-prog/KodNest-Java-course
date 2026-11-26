import java.util.*;
public class HashsetPro {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(55);
        hs.add(999);
        hs.add(10);
        hs.add(20);
        System.out.println(hs);

        hs.remove(20);
        System.out.println(hs);
        hs.clear();

        System.out.println(hs);

        HashSet hs2 = new HashSet();
        hs2.add("Anu");
        hs2.add("Raju");
        hs2.add("Zooni");
        hs2.add("Yuva");

        System.out.println(hs2);
    }
}