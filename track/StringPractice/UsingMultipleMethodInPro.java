public class UsingMultipleMethodInPro{
    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);//KodNest Technologies
        System.out.println(str.toLowerCase());//kodnest technologies
        System.out.println(str.toUpperCase());//KODNEST TECHNOLOGIES
        System.out.println(str.charAt(3));
        //System.out.println(str.charAt(99));//Exception outOfBoundary
        System.out.println(str.contains("Nest"));//true
        System.out.println(str.contains("nest"));//false
        System.out.println(str.startsWith("Kod"));//true
        System.out.println(str.startsWith("Nest"));//false
        System.out.println(str.endsWith("ies"));//true
        System.out.println(str.endsWith("kod"));//false
        System.out.println(str.indexOf("K"));//0
        System.out.println(str.indexOf("e"));//4
        System.out.println(str.length());//18
        System.out.println(str.replace('e','A'));// all e place replace A
        System.out.println(str.substring(5));//all given value start with 5 and go through last index
        System.out.println(str.subSequence(2, 10));//given value start with 2 and go end before the 10th index
        System.out.println(str.trim());//remove all spaces
        
        
    }
}