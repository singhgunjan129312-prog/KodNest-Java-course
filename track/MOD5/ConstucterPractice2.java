class Parent {
    Parent(){
        System.out.println("Inside the parent 0-parent  cons");
    }
}
class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Inside the child 0-par cons");
    }
    Child(int a){
        this(10,20);
        System.out.println("Inside the child 1-par  cons");
    }

    Child(int a,int b){
        System.out.println("Inside the child 2 cons");
    }
    
}
public class ConstructorPractice2{
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}