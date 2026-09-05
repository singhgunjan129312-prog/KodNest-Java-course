public class Practice{
    public static void main(String[] args) {
        int[] a = {0,1,0,0,4,3,0,2};
        int l = 0;
        int r = a.length - 1;
        while (l<r) {
            while(l<r && a[l]>0){
                l++;
            }
            while(l<r && a[r]==0){
                r--;
            }
            if (l < r) {
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
                l++;
                r--;
            }
        }
        for (int i = 0;i < a.length;i++) {
            System.out.print(a[i] + " ");
        }
    }
}