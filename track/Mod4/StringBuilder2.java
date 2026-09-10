public class StringBuilder2{
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Java");
        s1.ensureCapacity(100);
        System.out.println(s1.capacity());
        System.out.println(s1);
        s1.append("Program");
        System.out.println(s1);
    }
}