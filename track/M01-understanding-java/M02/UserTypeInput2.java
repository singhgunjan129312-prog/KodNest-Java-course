import java.util.Scanner;
public class UserTypeInput2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the your age:");
        int age =sc.nextInt();
        System.out.println("Age is: "+age);
        System.out.println("Enter your height");
        float height = sc.nextFloat();
        System.out.println("Height is: "+height);
        sc.nextLine();
        System.out.println("Enter your full name");
        String fName=sc.nextLine();
        System.out.println("Your name is:"+fName);
        String fna=sc.next();
        System.out.println("Your name is: "+fna);
    }
}
