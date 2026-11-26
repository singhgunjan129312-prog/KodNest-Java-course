
import java.util.Objects;
import java.util.*;

class Student extends Object {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

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

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class HashSetCodeREmoveDublicateval {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Anu");
        Student s2 = new Student(12, "Raju");
        Student s3 = new Student(11, "Anu");

        HashSet<Student> hs = new HashSet<>();

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        System.out.println(hs);
    }
}
