
public class placementRegarding {
    public static void main(String[] args) {

        int marks = 72;
        int attendance = 80;
        boolean activeBacklog = false;
        boolean projectCompleted = true;
        int mockInterviewScore = 65;

        if (marks < 60 || attendance < 75 || activeBacklog) {
            System.out.println("Improve Academic Eligibility");
        } 
        else if (!projectCompleted) {
            System.out.println("Complete the Project");
        } 
        else if (mockInterviewScore < 70) {
            System.out.println("Improve Interview Skills");
        } 
        else {
            System.out.println("Placement Ready");
        }
    }
}