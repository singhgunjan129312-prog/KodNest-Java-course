
import java.util.Scanner;

public class CheckWhetherTwoArrIdentical{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1=new int[n1];
        System.out.println("Enter first array");
        for(int i=0;i<n1;i++){
            a1[i]=sc.nextInt();
        }
        int n2 =sc.nextInt();
        int[] a2=new int[n2];
        System.out.println("Enter second array");
        for(int i=0;i<n2;i++){
            a2[i]=sc.nextInt();
        }   
        int flag=1;// assume 1 is identical and 0 is not identical 
        if(n1==n2){
            for(int i=0;i<n1;i++){
                if(a1[i]!=a2[i]){
                    flag = 1;
                    break;
                }else{
                    flag=0;
                }
            }
        }else{
            flag=1;
        }
        System.out.println(flag);
        }
}