import java.util.Scanner;

class Course {
    private String courseCode;

    Course(String courseCode) {
        // Store courseCode
        this.courseCode = courseCode;
    }
    public void getCourse() {
        System.out.println(courseCode);
    }
    // Create only a getter
}

public class CreateReadOnlyCouseCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Course c = new Course(name);
        c.getCourse();
        

        // Complete the program
    }
}