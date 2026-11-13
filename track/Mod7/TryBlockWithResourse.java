import java.util.Scanner;
class TryBlockWithResourse{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("Enter a:");
            int a = scan.nextInt();
            System.out.println(a);
        }
    }
}
