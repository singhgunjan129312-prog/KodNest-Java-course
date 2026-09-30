import java.util.Scanner;

class Employee {
    private int age;

    public boolean setAge(int age) {
        // Validate and store age
        
        if (age >= 18 && age <= 60) {
            this.age = age;
            return true;
        }
        return false;
    }

    public int getAge() {
        // Return the stored age
        return age;
    }
}

public class ValidateAnEmployeeAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        Employee e = new Employee();
        e.setAge(age);
        int ans = e.getAge();
        if (age >= 18 && age <= 60) {
            System.out.println(ans);
        } else {
            System.out.println("Invalid age");
        }

    }
}