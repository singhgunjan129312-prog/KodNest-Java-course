import java.util.ArrayList;
import javaimport java.util.ArrayList;
..util.ArrayList;
public class Prg2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.contains(300));
        System.out.println(al.contains(30));
        System.out.println(al.get(3));
        System.out.println(al.indexOf(20));
        System.out.println(al.isEmpty());
        System.out.println(al);
        System.out.println(al.size());
        al.add(99);
        System.out.println(al);
        al.add(30);
        System.out.println(al);
        System.out.println(al.indexOf(30));
        System.out.println(al.lastIndexOf(30));
        System.out.println(al);
        al.remove(6);
        System.out.println(al);
        al.set(2, "Raja");
        System.out.println(s);     
    }
}