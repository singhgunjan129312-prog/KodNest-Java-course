class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Monkey extends Animal{
    @Override
    void eat(){
        System.out.println("Monkey steals and eats");
    }
}
class Tiger extends Animal{
    @Override
    void eat(){
        System.out.println("Tiger hunts and eats meat");
    }
}
public class InheritancePractice2{
    public static void main(String[] args){
    
        Monkey m1=new Monkey();
        m1.eat();
        m1.sleep();
        Tiger t1=new Tiger();
        t1.eat(;)
        tt1.sleep();
        
    }
}