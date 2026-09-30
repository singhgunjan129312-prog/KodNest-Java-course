import java.util.Scanner;

class Student {
    private int marks;

    public boolean setMarks(int marks) {

        // Validate and store 
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            return true;
        } 
        return false;
    }

    public int getMarks() {
        // Return marks
        return marks;
    }
}

public class ValidateStudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ma = sc.nextInt();
        Student s = new Student();
        s.setMarks(ma);
        int ans = s.getMarks();
        if (ma >= 0 && ma <= 100) {
            System.out.println(ans);
        } else {
            System.out.println("Invalid marks");
        }

        // Complete the program
    }
}