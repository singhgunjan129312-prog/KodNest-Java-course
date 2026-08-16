import java.util.Scanner;
import java.util.regex.Pattern;
class Mobile{
    void number(int num){
        System.out.println("Unlooked the mobile by given password");
    }
    void text(String text){
        System.out.println("Unlocked the mobile by given text");
    }
    Pattern1 pattern(Pattern1 p){
        System.out.println("Unlocked the mobile by given pattern");
        return p;
    }
    Face face(Face f){
        System.out.println("Unlocked the mobile by face");
        return f;
    }
    Finger fig(Finger f1){
        System.out.println("Unlocked the mobile by finger");
        return f1;
    }

}
class Pattern1{

}
class Face{

}
class Finger{

}
public class MobileUnlockPro{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Mobile m=new Mobile();
        m.number(2345);
        m.text("fsgffg");
        Pattern1 p=new Pattern1();
         Pattern1 m1=m.pattern(p);
        System.out.println("Pattern is " + m1);
        Face f=new Face();
       Face m2= m.face(f);
       System.out.println("Face is " + m2);
        Finger f1=new Finger();
        Finger m3 = m.fig(f1);
        System.out.println("Finger print is " + m3);

        
    }
}
