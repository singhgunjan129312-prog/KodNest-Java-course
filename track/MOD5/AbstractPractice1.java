abstract class Parent{
    abstract void dis1();
    abstract void dis2();
}
class Child1 extends Parent{
    @Override
    void dis1(){
        System.out.println("Inside Child1 dis1");
    }
    @Override
    void dis2(){
        System.out.println("Inside Child1 dis2");
    }
    
}
class Child2 extends Parent{
    @Override
    void dis1(){
        System.out.println("Inside Child2 dis1");
    }
    @Override
    void dis2(){
        System.out.println("Inside Child2 dis2");
    }
}
public class AbstractPractice1{
    public static void main(String[] args){
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        accessMethod(ch1);
        accessMethod(ch2);
    }
    static void accessMethod(Parent ref){
        ref.dis1();
        ref.dis2();
    }
}
