

class LinkedNode {
    int val;
    LinkedNode next;
    public LinkedNode(int val) {
        this.val = val;
        next = null;
    }

}

public class Linkedlist {
    public static void main(String[] args) {
        //creatind nodes
        LinkedNode first = new LinkedNode(10);
        LinkedNode second = new LinkedNode(20);
        LinkedNode third = new LinkedNode(30);

        //Linking nodes
        first.next = second;
        second.next = third;

        //head
        LinkedNode head = first;
        LinkedNode current = head;
        //fetch
        while(current!= null) {
            System.out.println(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
        

    }
}