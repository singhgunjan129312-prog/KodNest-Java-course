import java.util.Scanner;
public class IntLearPtoRep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String fulName = sc.nextLine();
        System.out.println("Enter day");
        int day = sc.nextInt();
        int total=0;
        if (day>0) {
            for (int i = 1; i <=day; i++) {
                System.out.println("enter practice quation");
                int sP=sc.nextInt();
                total +=sP;
            }
        }
        double t=total;
        double d=day;
        double avg=t/d;
        String status;
        if(avg>=5.0){
            status="Consistent";
        } else{
            status="Needs consistency";
        }
        System.out.println("Learner: " + fulName);
        System.out.println("Total solved: "+ total);
        System.out.println("Daily avarage: " + avg);
        System.out.println("Status: " + status);
    
        sc.close();
    }
}