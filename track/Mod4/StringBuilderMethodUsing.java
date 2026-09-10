public class StringBuilderMethodUsing{
    public static void main(String[] args){
        StringBuilder s1 = new StringBuilder("Java");
        s1.ensureCapacity(100);
        System.out.println(s1);
        s1.append("program ");
        System.out.println(s1);
        s1.append("language");
        System.out.println(s1);
        s1.delete(0, 4);
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        
        
    }
}