class Robot {
    void speak() {
        System.out.println("Beep beep! Java is my superpower!");
    }
}

public class CreateFirstMethod {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.speak();
    }
}
