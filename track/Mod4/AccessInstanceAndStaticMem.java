
import java.util.Scanner;



class Learner{
    String name;
    static String institute = "KodNest";

    Learner(String name){
        this.name = name;
    }
    void displayName() {
        System.out.println("Learner: " + name);

    }
    static void displayInstitute() {
        System.out.println("Institute: " + institute);
    }

}
public class AccessInstanceAndStaticMem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na = sc.nextLine();
        Learner l1 = new Learner(na);
        l1.displayName();
        l1.displayInstitute();
        
    }
    
}