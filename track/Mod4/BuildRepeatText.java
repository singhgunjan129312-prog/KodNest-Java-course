import java.util.Scanner;
public class BuildRepeatText{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int repeatC= Integer.parseInt(sc.nextLine());
        StringBuilder b1 = new StringBuilder();
        for(int i =0;i<repeatC;i++){
            b1.append(s1);

        }
        System.out.println("Output string: " + b1.toString());
        sc.close();
    }
}