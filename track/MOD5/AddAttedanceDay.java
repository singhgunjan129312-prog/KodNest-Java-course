import java.util.Scanner;

class Attendance {
    private int days;

    public void addDays(int days) {
        // Add only a positive value
        if (days > 0) {
            this.days = days;
        }
    }

    public int getPresentDays() {
        // Return presentDays
        return days;
    }
}

public class AddAttedanceDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        Attendance a = new Attendance();
        a.addDays(day);
        int ans = a.getPresentDays();
        System.out.println(ans);

        // Complete the program
    }
}