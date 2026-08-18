class FindMinEleInArr{
    public static void main(String[] args) {
        int[] a =  {3,8,4,9,2,7};
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }

        System.out.println("the min value is :"+min);
    
    }
}