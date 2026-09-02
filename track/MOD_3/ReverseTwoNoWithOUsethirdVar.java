public class ReverseTwoNoWithOUsethirdVar{
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int l=0;
        int r=a.length-1;
        while(l<r){
            a[l] = a[l] + a[r];
            a[r]=a[l]-a[r];
            a[l]=a[l]+a[r];
            l++;
            r--;
        }
        System.out.print("Reverse th array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }
}