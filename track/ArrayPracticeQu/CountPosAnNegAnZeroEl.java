
import java.util.Scanner;

public class CountPosAnNegAnZeroEl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a = new int[n];
        for (int idx = 0; idx < a.length; idx++) {
            a[idx] = sc.nextInt();
            
        }
        int posCo = 0;
        int negCo = 0;
        int zeroCo = 0;
        for (int idx = 0; idx < a.length; idx++) {
            if (a[idx] > 0) {
                posCo++;
            } else if (a[idx] < 0) {
                negCo++;
            } else {
                zeroCo++;
            }
        }
        System.out.println(posCo + " " + negCo + " " + zeroCo);
    }
}