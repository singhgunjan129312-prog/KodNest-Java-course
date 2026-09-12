import java.util.Scanner;
import java.util.Arrays;
public class AnagramCheckUsingWithoutStringMe{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("Enter the element array:");
        if(s1.length() !=s2.length()){
            System.out.println("String are not Anagram");
            return;
        } 

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String ns1 = new String(arr1);
        String ns2=new String(arr2);
        if(ns1.equals(ns2)){
            System.out.println("String are Anagram");
        } else{
            System.out.println("String are not Anagram");
        }


    }
}