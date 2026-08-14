class Con{
    void collect(Money m){
        System.out.println("Money collected by conductor");
    }
    Ticket give(){
        Ticket t = new Ticket();
        System.out.println("Ticket Issued");
        return t;
    }

}
class Money{

}
class Ticket{

}
public class CreateBusTara {
    public static void main(String[] args) {
        Con c=new Con();
        Money m=new Money();
        c.collect(m);
        Ticket t=c.give();
        System.out.println(t);
        if(t!=null){
            System.out.println("Ticket collected");
        }
    }
}