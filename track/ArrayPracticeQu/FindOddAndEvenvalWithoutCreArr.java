import java.util.Scanner;
import javax.sound.midi.SysexMessage;
public class FindOddAndEvenvalWithoutCreArr{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int eveCo=0;
        int oddCo=0;
        for (int i =0;i < n;i++) {
            int val = sc.nextInt();
            if(val%2==0) {
                eveCo++;
            } else {
                oddCo++;
            }
        }
        System.out.println(eveCo + " " + oddCo);
    }


}