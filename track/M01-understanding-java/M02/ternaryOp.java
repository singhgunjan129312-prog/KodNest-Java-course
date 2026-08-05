public class ternaryOp{
    public static void main(String[] args){
        int attendance = 2;
        String status;
        String res = attendance<3 ? "ready" : "revision";
        System.out.println("status"+res);
    }
}