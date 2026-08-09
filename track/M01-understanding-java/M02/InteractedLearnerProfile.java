import java.util.Scanner;
public class InteractedLearnerProfile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String firstName = sc.next();
        int solvedProblem = sc.nextInt();
        double assessmentPercentage = sc.nextDouble();

        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblem);
        System.out.println("Assessment: " + assessmentPercentage);

        sc.close();
    }
}
