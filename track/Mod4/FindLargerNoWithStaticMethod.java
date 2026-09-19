import java.util.Scanner;
class NumberUtility{
    static int larger(int first,int second){
        int res = first > second ? first : second;
        return res;
    }
}
public class FindLargerNoWithStaticMethod{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Larger: "+NumberUtility.larger(a,b));

    }
}