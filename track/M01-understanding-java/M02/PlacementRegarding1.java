public class PlacementRegarding1 {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;
        // Ternary operator
        String result = (marks >= 60 && attendance >= 75) ? "Placement Ready" : "Continue Practicing";
        System.out.println(result);
        // For loop
        for (int day = 1; day <= practiceDays; day++) {
            System.out.println("Practice Day: " + day);
        }
    }
}