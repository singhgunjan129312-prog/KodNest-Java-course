import java.util.Scanner;
public class ThreeDArray1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][][] a=new int[3][3][5];
        System.out.println("Enter Array Element: ");
         for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("Enter array values are:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    System.out.println(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}