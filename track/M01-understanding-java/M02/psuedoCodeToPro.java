public class psuedoCodeToPro{
    public static void main(String[] args) {
        

        // Declare and initialize variables
        int javaHoursPerDay = 2;
        int aptitudeHoursPerDay = 1;
        int numberOfDays = 5;

        // Calculate weekly study hours
        int weeklyJavaHours = javaHoursPerDay * numberOfDays;
        int weeklyAptitudeHours = aptitudeHoursPerDay * numberOfDays;

        // Calculate total preparation hours
        int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;

        // Display the results
        System.out.println("Java: " + weeklyJavaHours);
        System.out.println("Aptitude: " + weeklyAptitudeHours);
        System.out.println("Total: " + totalPreparationHours);
    

    }
}