import java.util.Scanner;

public class CheckLowerCaseAngram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();
        if (first.length() != second.length()) {
            System.out.println("Anagram: false");
            return;
        }
        StringBuilder b1 = new StringBuilder(second);
        for (int i = 0;i < first.length();i++) {
            String ch = String.valueOf(first.charAt(i));
            int ind = b1.indexOf(ch);
            if (ind != -1) {
                b1.deleteCharAt(ind);
            } else {
                System.out.println("Anagram: false");
                return;
            }
        }
        System.out.println("Anagram: true");

        
    }
}