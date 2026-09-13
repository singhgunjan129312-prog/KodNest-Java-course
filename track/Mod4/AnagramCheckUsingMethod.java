import java.util.Scanner;
public class AnagramCheckUsingMethod{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("Anagram: false");
            return;
        }
        StringBuilder b1 = new StringBuilder(s2);
        for (int i =0;i<s1.length();i++) {
            String ch = String.valueOf(s1.charAt(i));
            int ind = b1.indexOf(ch);
            if (ind != -1){
                b1.deleteCharAt(ind);
            } else{
                System.out.println("Anagram: false");
                return;
            }
        }
        System.out.println("Anagram: true");
        
    }
}