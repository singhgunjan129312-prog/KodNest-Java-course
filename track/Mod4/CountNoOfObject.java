class Demo{
    static int count = 0;
    //{
     //   count++;
    //}
    Demo(){
        count++;
    }

}
public class CountNoOfObject{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        Demo d4 = new Demo();
        Demo d5 = new Demo();
        System.out.println(Demo.count);

        
    }
}