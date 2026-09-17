class Car{
    static void convertKmInto(){
        System.out.println("Converting KM into Miles..");
        
    }
    void calculateMilage(){
        System.out.println("Calculating Milage...");
    }
}
public class StaticPractice1{
    public static void main(String[] args) {
        Car.convertKmInto();
        Car nano= new Car();
        nano.calculateMilage();
        Car bmw = new Car();
        bmw.calculateMilage();
    }

}