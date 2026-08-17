import java.util.Scanner;
public class DeclareReverseArrayElement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the Array Element:");
        for(int i=a.length-1;i>=0;i--){
            //for(i=0;i<a.length;i++)
            a[i]=sc.nextInt();}
    }
        System.out.println("Enter the values of Array:");
        for (int i=0;i<a.length;i++){
            // for(i=0;i<a.length;i++)
            System.out.println(a[i]);
        }
   }
}
    