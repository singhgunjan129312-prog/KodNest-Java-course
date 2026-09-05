import java.util.Scanner;
public class PairWithTarSumOfSortArr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=0;
        int r=a.length-1;
        int tar = sc.nextInt();
        boolean flag=false;
        while(l<r){
            int sum=a[l]+a[r];
            if(sum==tar){
                System.out.println(a[l] + " " + a[r]);
                flag = true;
                break;
            } else if(sum<tar){
                l++;
            }
            else{
                r--;
            }
        }
        if(!flag){
            System.out.println("-1");
        }
    }
}