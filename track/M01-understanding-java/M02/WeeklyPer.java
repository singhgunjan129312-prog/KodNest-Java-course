public class WeeklyPer {
    public static void main(String[] args) {

        int practiceDays = 5;
        int revisionDay = 3;
        int sessionsPerDay = 2;
        int finalDaySessionLimit = 1;
        int targetSessions = 7;

        int completedSessions = 0;

        // Outer loop for days
        for (int day = 1; day <= practiceDays; day++) {

            // Skip the revision day
            if (day == revisionDay) {
                continue;
            }

            // Inner loop for sessions
            for (int session = 1; session <= sessionsPerDay; session++) {

                // Final day has only one session
                if (day == practiceDays && session > finalDaySessionLimit) {
                    break;
                }

                System.out.println("Day " + day + " - Session " + session);
                completedSessions++;
            }
        }

        // Print total completed sessions
        System.out.println("Completed Sessions: " + completedSessions);

        // Check target
        if (completedSessions >= targetSessions) {
            System.out.println("Target Achieved");
        } else {
            System.out.println("Target Pending");
        }
    }
}