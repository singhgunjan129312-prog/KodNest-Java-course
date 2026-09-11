
import java.util.Scanner;

public class PalindromeOfString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.next();
        char[] charArr = str.toCharArray();
        char[] revArr= new char[charArr.length];
        int j=charArr.length-1;
        for(int i = 0;i<revArr.length;i++){
                revArr[j]=charArr[i];
                j--;
        }
        String revString = new String(revArr);
        if(str.equalsIgnoreCase(revString)){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("The string is not a palindrome");
            sc.close();

        }


    }
}