import java.util.Scanner;

public class StoreValOfAnotherArrOfReverseOr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter the array  a elemnt");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int[] b=new int[a.length];
        
        System.out.println("Enter the array b element");
        int j=b.length;
        for(int i=0;i<a.length;i++){
            b[j]=a[i];
            j--;
        }
        System.out.println("Enter the value of array a");
         for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
        
        System.out.println("Enter the value of array b");
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);

        }
    }
}