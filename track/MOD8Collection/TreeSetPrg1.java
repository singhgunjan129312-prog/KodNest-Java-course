import java.util.*;
public class TreeSetPrg1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);

        //its give lower value of at value
        System.out.println(ts.headSet(75));
        System.out.println(ts.headSet(75,true));

        //given higher value with at value
        System.out.println(ts.tailSet(100));
        System.out.println(ts.tailSet(100,false));

        //given imediate higher value of at val
        System.out.println(ts.higher(100));
        System.out.println(ts.higher(80));
        System.out.println(ts.higher(200));
        System.out.println(ts.higher(0));

        //given imediate lower value of at value
        System.out.println(ts.lower(100));
        System.out.println(ts.lower(30));
        System.out.println(ts.lower(10));

        //given heighest value
        System.out.println(ts.ceiling(100));
        System.out.println(ts.ceiling(80));
        System.out.println(ts.ceiling(200));

        // given lowest value
        System.out.println(ts.floor(125));
        System.out.println(ts.floor(70));
        System.out.println(ts.floor(20));
    }
}