import java.util.Scanner;
public class TwoDArray2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][5];
        System.out.println("Enter the Array Element: ");
        for (int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter the array value are: ");
         for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }
    }
}