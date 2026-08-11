import java.util.Scanner;

// Student class with required fields
class Student {
    int registrationId;
    String name;
    double attendancePercentage;

    // Constructor to initialize fields
    public Student(int registrationId, String name, double attendancePercentage) {
        this.registrationId = registrationId;
        this.name = name;
        this.attendancePercentage = attendancePercentage;
    }

    // Method formatted precisely to match the requested output structure
    public void display() {
        System.out.println(registrationId + " - " + name + " - " + attendancePercentage + "%");
    }
}

public class StuRegObjSy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read values 1 to 3: First student details
        int id1 = scanner.nextInt();
        String name1 = scanner.next();
        double attendance1 = scanner.nextDouble();
        Student student1 = new Student(id1, name1, attendance1);

        // Read values 4 to 6: Second student details
        int id2 = scanner.nextInt();
        String name2 = scanner.next();
        double attendance2 = scanner.nextDouble();
        Student student2 = new Student(id2, name2, attendance2);

        // Read values 7 and 8: Target ID to select and new attendance percentage
        int searchId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        // Object reference without allocating a third Student object
        Student selectedStudent = null;

        // Reference assignment check
        if (student1.registrationId == searchId) {
            selectedStudent = student1;
        } else if (student2.registrationId == searchId) {
            selectedStudent = student2;
        }

        // Print logic based on validity of the Registration ID
        if (selectedStudent != null) {
            // Update the attendance value via reference pointer
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Print final records for both students
        student1.display();
        student2.display();

        scanner.close();
    }
}