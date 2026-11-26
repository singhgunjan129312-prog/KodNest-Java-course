
import java.util.*;

class Prg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Insert, update and Remove List Elements
        List<String> name = new ArrayList();
        name.add("Anu");
        name.add("Banu");
        System.out.println(name);
        name.add(1,"Ravi");
        System.out.println(name);
        name.set(1,"Ravi B S");
        System.out.println(name);
        name.remove(0);
        System.out.println(name);
    }
}