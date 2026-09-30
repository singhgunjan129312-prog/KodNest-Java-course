import java.util.Scanner;

class Course {
    private double fee;

    Course(double fee) {
        // Store fee
        this.fee = fee;
    }
    public double getFee() {
        return fee;
    }
    // Create getFee()
}

public class ReadPrivateCourseFree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val = sc.nextDouble();
        Course c = new Course(val);
        double ans = c.getFee();
        System.out.println(ans);

        // Complete the program
    }
}