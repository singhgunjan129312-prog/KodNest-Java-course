import java.util.Scanner;
public class MinAndMaxFindWithoutArrCre{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int min = sc.nextInt();
        int max = min;
        for (int i = 0;i < n;i++) {
            int val = sc.nextInt();
            if (val < min) {
                min = val;
            }
            if(val > max) {
                max = val;
            }
        }
        System.out.println(min + " " + max);
    }

}