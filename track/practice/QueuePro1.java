public class QueuePro1 {
    public static void main(String[] args) {
        int queue[] = new int[5];
        int font = 0;
        int rear = 0;
        queue[rear++] = 10;
        queue[rear++] = 20;
        queue[rear++] = 30;
        System.out.println("Size: " + (rear-font));
        font++;
        System.out.println("Size: " + (rear-font));
    }
}