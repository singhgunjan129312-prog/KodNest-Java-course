import java.util.Scanner;
public class TwoDArrayTriangle3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][];
        int[] arr[0] = new int[4];
        int[] arr[1] =new int[3];
        int 
        System.out.println("Enter the Array Element: ");
        for (int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the array value are: ");
         for (int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }
    }
}