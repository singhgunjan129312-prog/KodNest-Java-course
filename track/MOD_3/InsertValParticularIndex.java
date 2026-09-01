import java.util.Scanner;
class InsertValParticularIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i =0;i < n;i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[a.length];
        //for(int i = 0;i<n;i++) {
        //    b[i] = sc.nextInt();
        //}
        int ind = 2;
        int val = 30;
        for (int i =0;i< ind;i++) {
            b[i]=a[i];
        }
        b[ind]= val;
        for (int i = ind;i<a.length;i++){
            b[i+1]=a[i];
        }
        for (int i =0;i<n;i++) {
            System.out.print(b[i]);
        }
        

    }
}