class Parent {
    void display1(){
        System.out.println("Inside Parent dis1");
    }
    void display2(){
        System.out.println("Inside Parent dis2");
    }
}
class Child extends Parent {
    void display2(){
        System.out.println("Inside Child dis2");
    }
    void display3(){
        System.out.println("Inside Child dis3");
    }
}
public class InheritancePractice1{
    public static void main(String[] args){
    
        Child c1=new Child();


        c1.display1();
        c1.display2();
        c1.display3();
    }
}