import java.util.Scanner;
public class StaticArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int idx = 0; idx < arr.length; idx++) {
             arr[idx]=sc.nextInt();
        }
        int min=arr[0];
        int mux=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>mux){
                mux=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + mux);
    }
}