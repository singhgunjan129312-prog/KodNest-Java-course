import java.util.Scanner;
public class UserTypeInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the byte value :");
        byte a=sc.nextByte();
        System.out.println("Byte value is :" + a);
        System.out.println("Enter the shor type value: ");
        short b=sc.nextShort();
        System.out.println("Short value is :" + b);
        System.err.println("Enter int type value: ");
        int c=sc.nextInt();
        System.out.println("Integer value is : " +c);
        System.out.println("Enter the long type value: ");
        long d=sc.nextLong();
        System.out.println("Long type value is: "+ d);
        System.out.println("Enter the float value:");
        float e=sc.nextFloat();
        System.out.println("Float value is: " + e);
        System.out.println("Enter the double value :");
        double f=sc.nextDouble();
        System.out.println("Double value is: "+ f);
        System.out.println("Enter the boolean value:");
        boolean g=sc.nextBoolean();
        System.out.println("Boolean value is: " + g);

    }
}