import java.util.Objects;
class Student{
    int roll;
    String name;
    Student(int roll,String name) {
        this.roll=roll;
        this.name=name;
    }
    @Override
    public int hashCode(){
        return Objects.hash(roll,name);
    }
    @Override
    public String toString(){
        return roll + " " + name;
    }
    void display(){
        System.out.println(roll);
        System.out.println(name);
    }
}
public class HashCodePra1{
    public static void main(String[] args){
        Student s1 = new Student(11,"Arjun");
        Student s2 = new Student(12,"Raju");
        Student s3 = new Student(11,"Arjun");

       Object s4 = new Student(22,"Ravi");
       //give current class 
       System.out.println(s1.getClass());
       //parent class access child class
       System.out.println(s4.getClass());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        

        
    }
}
    