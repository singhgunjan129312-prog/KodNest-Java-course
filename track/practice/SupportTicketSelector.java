import java.util.Scanner;

class SupportTicket {
    int id;
    int priority;
    int waitingMinutes;

    SupportTicket(int id, int priority, int waitingMinutes) {
        this.id = id;
        this.priority = priority;
        this.waitingMinutes = waitingMinutes;
    }
}

public class SupportTicketSelector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read three tickets
        SupportTicket ticket1 = new SupportTicket(
                sc.nextInt(), sc.nextInt(), sc.nextInt());

        SupportTicket ticket2 = new SupportTicket(
                sc.nextInt(), sc.nextInt(), sc.nextInt());

        SupportTicket ticket3 = new SupportTicket(
                sc.nextInt(), sc.nextInt(), sc.nextInt());

        // Start with first ticket selected
        SupportTicket selected = ticket1;

        // Compare second ticket with selected
        if (ticket2.priority > selected.priority ||
            (ticket2.priority == selected.priority &&
             ticket2.waitingMinutes > selected.waitingMinutes) ||
            (ticket2.priority == selected.priority &&
             ticket2.waitingMinutes == selected.waitingMinutes &&
             ticket2.id < selected.id)) {

            selected = ticket2;
        }

        // Compare third ticket with selected
        if (ticket3.priority > selected.priority ||
            (ticket3.priority == selected.priority &&
             ticket3.waitingMinutes > selected.waitingMinutes) ||
            (ticket3.priority == selected.priority &&
             ticket3.waitingMinutes == selected.waitingMinutes &&
             ticket3.id < selected.id)) {

            selected = ticket3;
        }

        // Exactly three output lines
        System.out.println("Selected Ticket: " + selected.id);
        System.out.println("Priority: " + selected.priority);
        System.out.println("Waiting Minutes: " + selected.waitingMinutes);

        sc.close();
    }
}