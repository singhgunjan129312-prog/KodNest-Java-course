import java.util.Scanner;
class Demo {
    static {
        System.out.println("Static block execution");;
    }
    Demo(){
        System.out.println("Constructor is running");
    }
}
public class ObserveStaticBlockExe{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 1;i<=count;i++) {
            new Demo();
        }
    }
}