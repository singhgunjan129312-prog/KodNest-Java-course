import java.util.Scanner;
public class PalndromOrNot{
    static int[] reve(int[] a,int l,int r){
        while(l<r){
            int temp = a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int idx = 0; idx < n; idx++) {
            a[idx]=sc.nextInt();
        }
        int[] b = new int[a.length];
        for (int idx = 0; idx < b.length; idx++) {
            
            b[idx]=a[idx];
        }
        int l = 0;
        int r = a.length-1;
        int[] val=reve(a,l,r);
        int flag = 0;
        for (int idx = 0; idx < b.length; idx++) {
            if(b[idx]!=val[idx]){
                flag = 0;
                break;
            } 
            flag = 1;
        }
        System.out.println(flag);

    }
}