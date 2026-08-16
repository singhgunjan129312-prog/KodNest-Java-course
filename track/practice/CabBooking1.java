import java.util.Scanner;

class CabBooking {

    String passengerName;
    String cabType;
    int distance;
    int fare;

    // Quick booking constructor
    public CabBooking(String passengerName) {
        this.passengerName = passengerName;
        this.cabType = "Mini";
        this.distance = 5;
        this.fare = 75;
    }

    // Custom booking constructor
    public CabBooking(String passengerName, String cabType, int distance) {
        this.passengerName = passengerName;
        this.cabType = cabType;
        this.distance = distance;
        this.fare = distance * 15;
    }

    // Display booking
    void displayBooking() {
        System.out.println("Passenger: " + passengerName);
        System.out.println("Cab Type: " + cabType);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: Rs. " + fare);
    }
}

public class CabBooking1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        String passengerName = sc.next();

        CabBooking c;

        if (choice == 1) {
            c = new CabBooking(passengerName);
        } 
        else if (choice == 2) {
            String cabType = sc.next();
            int distance = sc.nextInt();

            c = new CabBooking(passengerName, cabType, distance);
        } 
        else {
            return;
        }

        c.displayBooking();

        sc.close();
    }
}