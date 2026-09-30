import java.util.Scanner;

class Person {
    private String name;

    public void setName(String name) {
        // Store the name
        this.name = name;
    }

    public void displayWelcome() {
        // Print Welcome followed by the name
        System.out.println("Welcome " + name);
    }
}


class Employee extends Person {

}

public class ReuseParentMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na = sc.nextLine();
        Employee e = new Employee();
        e.setName(na);
        e.displayWelcome();

    }
}