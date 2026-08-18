public class CalAverageValInArrayEle {
    public static void main(String[] args) {
        // Write your code here.
        int[] marks = {70, 80, 60, 90, 50};
        int sum = 0;
        
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        
        System.out.println("Total: " + sum);
        
        double avg = sum / marks.length;
        System.out.println("Average: " + avg);
    }
}
