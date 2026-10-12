class Student{
    int roll;
    String name;

    @Override 
    public boolean equals(Object obj){
        Student s = (Student)obj;
        if(this.roll=s.roll && this.name.equals(s.name)){
            //System.out.println(" Both are equal");
            return true;
            
        }
        else {
            return false;
        }
    }    
    void display(){
        System.out.println(roll);
        System.out.println(name);
    }
    
}
public class EqualsMethodRealUse2{
    public static void main(String[] args){
        Student s1=new Student(11,"Arjun");
        Student s2=new Student(12,"Raju");
        Student s3=new Student(11,"Arjun");

        s1.display();
        s2.display();
        s3.display();
        System.out.println(s1.equals(s2));
        System.out.println("------");
        System.out.println(s1.equals(s3));

        

        
    }
}