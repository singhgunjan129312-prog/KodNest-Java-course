class Parent{
    Parent(int a){
        super();
        System.out.println("Inside Parent 1 constructer");
    }
}

class Child extends Parent{
    Child() {
        super(10);
        System.out.println("Inside child 0 constructer");
    }
}
public class ConstructerPractice {
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}