import java.util.Scanner;

class ExceptionManageRethereted{
    public static void main(String args){
        System.out.println("Main method Execution Started....");
            try{
                divide();

            }
            catch(Exeception e){
                System.out.println("Exception handled in Main")
            }
        System.out.println("Main method Execution Completed....");
    }
    static void divide(){
        try{
            System.out.println("Division started");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int res = a/b;
            System.out.println(res);

        }
        catch(Exeception e){
            System.out.println("Exception handled in divide Method");
            throw e;
        }

        finally{
            System.out.println("Division completed");
        }
    }
}