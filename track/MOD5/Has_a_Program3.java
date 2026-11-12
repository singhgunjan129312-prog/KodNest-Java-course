class OS{
    OS(){
        System.out.println("os is installed");
    }
    void checkOs(){
        System.out.println("Os is still executing");
    }
}
class Charger{

    public Charger() {
        System.out.println("Charger created");
    }
    void getCharger(){
        System.out.println("Charger can be used for charging");
    }
}
class Mobile{
    OS o= new OS();

    public Mobile() {
        System.out.println("Mobile created with Os");
    }
    void hasA(Charger c){
        System.out.println("Charger accuired");
    }
    
}
public class Has_a_Program3{
    public static void main(String[] args){
        
        Mobile m;
        m=new Mobile();
        Charger c;
        c= new Charger();
        m.hasA(c);
        c.getCharger();
        m=null;
        m.hasA(c);;
    }
}