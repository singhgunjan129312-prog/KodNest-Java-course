
import java.util.Scanner;


/*public class Ab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        StringBuilder b1 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (b1.indexOf(String.valueOf(ch)) == -1) {
                b1.append(ch);
            }
        }

        System.out.println(b1.toString());

        sc.close();
    }
}*/
public class Ab{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "madam";
        StringBuilder b1 = new StringBuilder();
        for(int i = 0;i < str.length();i++) {
            char ch=str.charAt(i);
            if(b1.indexOf(String.valueOf(ch))!=-1) {
                b1.deleteCharAt(b1.indexOf(String.valueOf(ch)));
                
            }
        }
        System.out.println(b1.toString());
    }
}
