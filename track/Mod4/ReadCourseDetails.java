import java.util.Scanner;

public class ReadCourseDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c = sc.nextLine();
        String t = sc.nextLine();
        System.out.println("Course: " + c);
        System.out.println("Trainer: " + t);
    }
}
