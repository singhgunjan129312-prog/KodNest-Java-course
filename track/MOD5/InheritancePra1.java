class Demo1{
    int a = 10;
    void dis1(){
        System.out.println("Demo1 :" + a);
    }

}
class Demo2 extends Demo1{
    
}
public class InheritancePra1{
    public static void main(String[] args) {
        Demo1 d2 = new Demo2();
        d2.dis1();

    }
}