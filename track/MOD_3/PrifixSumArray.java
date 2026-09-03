import java.util.Scanner;
public class PrifixSumArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];        
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] ps = new int[n];
        ps[0] = a[0];
        for (int i=1;i<n;i++){
            ps[i] = ps[i-1]+a[i]; 
        }
        
        for (int idx = 0; idx < n; idx++) {
            System.out.print(ps[idx] + " ");
            
        }
    }

}