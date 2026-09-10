
import java.util.Scanner;

public class BuildStringBuffPra1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String learner = sc.nextLine();
        String course = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        builder.append("Learner: ");
        builder.append(learner);
        builder.append(" | Course: ");
        builder.append(course);
        System.out.println(builder);
    }
}