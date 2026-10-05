class Parent {
    Parent() {
        System.out.println("Inside the parent 0-parameter constructor");
    }
}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Inside the child 0-parameter constructor");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("Inside the child 1-parameter constructor");
    }

    Child(int a, int b) {
        System.out.println("Inside the child 2-parameter constructor");
    }
}

public class ConstructerPractice2 {
    public static void main(String[] args) {
        Child c1 = new Child();
    }
}