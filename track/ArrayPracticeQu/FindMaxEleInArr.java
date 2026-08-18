class FindMaxEleInArr{
    public static void main(String[] args) {
        int[] a =  {3,8,4,9,2,7};
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }

        System.out.println("the max value is :"+max);
    
    }
}