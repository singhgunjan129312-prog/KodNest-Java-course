import java.util.Scanner;

class TheatreBooking {

    int[] seats;
    int bookedCount;

    public TheatreBooking(int totalSeats) {
        this.seats = new int[totalSeats];
        this.bookedCount = 0;
    }

    public String bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            return "Invalid Seat";
        }

        int arrayIndex = seatNumber - 1;

        if (seats[arrayIndex] == 1) {
            return "Already Booked";
        }

        seats[arrayIndex] = 1;
        bookedCount++;
        return "Booked";
    }

    public int getAvailableCount() {
        int availableCount = seats.length - bookedCount;
        return availableCount;
    }

    public void displaySeatStatus() {
        System.out.println("Seat Status");
        for (int i = 0; i < seats.length; i++) {
            int seatNumber = i + 1;
            String status = (seats[i] == 1) ? "Booked" : "Available";
            System.out.println("Seat " + seatNumber + ": " + status);
        }
    }
}

public class TheatreBookingMangSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSeats = scanner.nextInt();
        int totalRequests = scanner.nextInt();

        TheatreBooking bookingSystem = new TheatreBooking(totalSeats);

        for (int requestNum = 1; requestNum <= totalRequests; requestNum++) {
            int seatNumber = scanner.nextInt();
            String result = bookingSystem.bookSeat(seatNumber);
            System.out.println("Request " + requestNum + " - Seat " + seatNumber + ": " + result);
        }

        bookingSystem.displaySeatStatus();
        System.out.println("Booked Seats: " + bookingSystem.bookedCount);
        System.out.println("Available Seats: " + bookingSystem.getAvailableCount());

        scanner.close();
    }
}
