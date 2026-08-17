import java.util.Scanner;
public class DeclareArrayEleUsiLoop2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter the Array Element:");
        for(int i=0;i<=4;i++){
            //for(i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the values of Array:");
        for (int i=0;i<=4;i++){
            // for(i=0;i<a.length;i++)
            System.out.println(a[i]);
        }
            
        }
    }
