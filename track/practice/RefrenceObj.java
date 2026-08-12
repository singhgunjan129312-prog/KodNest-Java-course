import java.util.Scanner;

// Define the class with the required field
class PracticeTask {
    int id;

    public PracticeTask(int id) {
        this.id = id;
    }
}

public class RefrenceObj{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read three different task IDs in order
        int id1 = scanner.nextInt();
        int id2 = scanner.nextInt();
        int id3 = scanner.nextInt();

        // Build three PracticeTask objects
        PracticeTask first = new PracticeTask(id1);
        PracticeTask second = new PracticeTask(id2);
        PracticeTask third = new PracticeTask(id3);

        // --- Required Reference Relay ---
        
        // 1. Store the first object's ID in an int variable named unreachableId.
        int unreachableId = first.id;

        // 2. Create a PracticeTask reference named relay and assign first to it.
        PracticeTask relay = first;

        // 3. Assign second to first.
        first = second;

        // 4. Assign third to second.
        second = third;

        // 5. Assign second to relay.
        relay = second;

        // 6. Assign first to third.
        third = first;

        // --- Exact Output Format ---
        System.out.println("First Reference: " + first.id);
        System.out.println("Second Reference: " + second.id);
        System.out.println("Third Reference: " + third.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableId);

        scanner.close();
    }
}
