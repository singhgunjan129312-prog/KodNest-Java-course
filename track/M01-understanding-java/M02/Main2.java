public class Main2 {
    public static void main(String[] args) {

        // Simple Interest
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;

        double simpleInterest = (principal * rate * time) / 100.0;
        double totalAmount = principal + simpleInterest;

        // BMI
        double weight = 72.0;
        double height = 1.8;

        double bmi = weight / (height * height);

        // Marks Percentage
        int mark1 = 78;
        int mark2 = 84;
        int mark3 = 69;
        int mark4 = 91;
        int mark5 = 88;

        int totalMarks = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = (totalMarks / 500.0) * 100;

        // Output
        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("Total Amount = " + totalAmount);
        System.out.println("BMI = " + bmi);
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + percentage);
    }
}