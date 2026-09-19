import java.util.Scanner;
class Message{
    String text;
    Message(Sting text) {
        this.text = text;
    }
    void displayText(){
        System.out.println("Message: " + text);

    }
    Static void displayCourse() {
        System.out.println("Course: Java");
    }
}
public class CallInstanceAndStaticMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Message m1 = new Message(text);
        m1.displayText();
        m1.displayCourse();
    }
}