
import java.util.Scanner;


public class PriRow{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int column=1;column<=row;column++){
                System.out.print(row);
                if(column<row){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}