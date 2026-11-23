class Printer implements Runnable {
    @Override
    synchronized public void run(){
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " started using printer");
            Thread.sleep(3000);
            System.out.println(threadName + " is using printer");
            Thread.sleep(3000);
            System.out.println(threadName + " stopped using printer");
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class SynchronizePro {
    public static void main(String[] args) {
        
        Printer pr = new Printer();

        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(pr);
        Thread t3 = new Thread(pr);

        t1.setName("Java Developer");
        
        t2.setName("Python Developer");
        
        t3.setName("C Developer");


        t1.start();
        t2.start();
        t3.start();
    }
}