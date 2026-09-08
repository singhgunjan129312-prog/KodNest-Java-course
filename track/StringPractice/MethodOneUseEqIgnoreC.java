public class MethodOneUseEqIgnoreC{
    public static void main(String[] args){
        String s1 = "java";
        String s2 = "jaVa";
        if (s1==s2){
            System.out.println("Ref are same");
        } else {
            System.out.println("Ref are not same");
        }
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("String are same");
        } else {
            System.out.println("String are not same");
        }
    }
}