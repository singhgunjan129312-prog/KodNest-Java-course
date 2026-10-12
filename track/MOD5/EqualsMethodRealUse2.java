
class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }

        Student s = (Student) obj;

        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }


    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class EqualsMethodRealUse2 {
    public static void main(String[] args) {

        Student s1 = new Student(11, "Arjun");
        Student s2 = new Student(12, "Raju");
        Student s3 = new Student(11, "Arjun");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.equals(s2));

        System.out.println("------");

        System.out.println(s1.equals(s3));
    }
}
