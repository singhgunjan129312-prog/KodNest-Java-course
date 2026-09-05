import java.util.Scanner;
public class MoveAllZeroValBegAndOneLast{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=0;
        int r =a.length-1;
        while(l<r){
            while(l<r && a[l]==0){
                l++;
            }
            while(l<r && a[r]==1){
                r--;
            }
            if(l<r){
                int temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;

            }
        }
        for (int idx = 0; idx < n; idx++) {
            
            System.out.print(a[idx] + " ");
        }
    }
}