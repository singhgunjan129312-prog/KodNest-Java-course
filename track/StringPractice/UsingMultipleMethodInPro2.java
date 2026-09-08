public class UsingMultipleMethodInPro2{
    public static void main(String[] args){
        String s1 = "Raja";
        System.out.println(s1.isBlank());//false
        System.out.println(s1.isEmpty());//false
        String s2 = " ";
        System.out.println(s2.isBlank());//true
        System.out.println(s2.isEmpty());//false
        String s3 = "";
        System.out.println(s3.isBlank());//true
        System.out.println(s3.isEmpty());//true
    }
}