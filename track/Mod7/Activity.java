

import java.util.Scanner;

class Addition extends Thread{
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Addition activity Started....");
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int res = a + b;
        System.out.println("Addition result is: " + res);
        System.out.println("Addition activity completed....");
    }    
}

class PrintNum extends Thread {
    @Override
    public void run(){
        System.out.println("Printing num activity started...");
        for(int i = 1;i <= 5;i++){
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
   
            }
            System.out.println("Printing activity completed...");
        }
    }
}

class PrintChar extends Thread {
    @Override
    public void run() {
        System.out.println("Printing char activity stated...");

        for(char i = 'A';i <= 'G';i++) {
            System.out.println(i);
            try {
             Thread.sleep(3000);   
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Printing activity completed...");
    }

}

public class Activity{
    public static void main(String[] args) {
        Addition ad1 = new Addition();
        Addition ad2 = new Addition();
        Addition ad3 = new Addition();

        ad1.setName("ADD");
        ad2.setName("CHAR");
        ad3.setName("NUM"); 
        ad1.start();
        ad2.start();
        ad3.start(); 
         
    }
}