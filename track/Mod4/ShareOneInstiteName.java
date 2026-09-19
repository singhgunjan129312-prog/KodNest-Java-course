import java.util.Scanner;
class Learner{
    String learnerName;
    static String instituteName;
    Learner(String learnerName){
        this.learnerName=learnerName;
        
    }
    void display(){
        System.out.println(LearnerName + " - " + instituName);
    }
}
public class ShareOneInstitute{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Learner.instituteName="kod Nest";
        String name1=sc.next();
        String name2=sc.next();
        Learner l1 = new Learner(name1);
        Learner l2 = new Learner(name2);
        l1.display();
        l2.display();

    }
    
}