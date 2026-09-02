public class ReverseArrWithUsingThirsVar{
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        int l=0;
        int r = a.length-1;
        while(l<r){
            int temp=a[l];
            a[l]=a[r];
            a[r]=temp;
            l++;
            r--;        }
            System.out.print("REverse the array element: ");
            for (int i =0;i<a.length;i++) {
                System.out.print(a[i] + " ");
            }
    }
    
    }
