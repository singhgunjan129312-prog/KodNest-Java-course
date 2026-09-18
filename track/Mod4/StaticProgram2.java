import java.util.Scanner;
class Demo{
    static {
        System.out.println("1st static-block executed.");
    }
    static {
        System.out.println("2nd static-block executed.");
    }
    static {
        System.out.println("3rd static-block executed.");
    }
    {
        System.out.println("1st non-static-block executed.");
    }
    {
        System.out.println("2nd non-static-block executed.");
    }
    {
        System.out.println("3rd non-static-block executed.");
    }
}
public class StaticProgram2{
    public static void main(String[] args) {
        Demo d1 = new  Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
    }
}