
import java.lang.annotation.Target;

class Freq{
    int count=0;
    void countTar(int[] a,int tar){
        for(int i=0;i<a.length;i++){
            if(a[i]==tar){
                count++;
            }
        }
        System.out.println(tar + ";" + count);
    }
}
public class CountHowTimeTargetPre{
    public static void main(String[] args) {
         int[] arr={23,76,34,77,23,74,75};
   int target=23;
    Freq f=new Freq();
    f.countTar(arr,target);
    }
   

}