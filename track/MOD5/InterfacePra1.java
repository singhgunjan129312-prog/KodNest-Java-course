interface Shape{
    public abstract void input();
    public abstract void dis();
}

class Square implements Shape {
    @Override
    public void input(){
        System.out.println("Input");
    }

    @Override
    public void dis(){
        System.out.println("Dis");
    }   
}
 
public class InterfacePra1 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.input();
        s1.dis();
        //Shape ref = new Shape();//Error
        Shape ref;
        ref = s1;
        ref.dis();
        ref.input();
    }
}

