import java.util.Scanner;
public class SwapAdjecentPair{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i += 2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}