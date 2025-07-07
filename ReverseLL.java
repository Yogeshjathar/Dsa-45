
class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

public class ReverseLL {

    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // LinkedList<Integer> ll = new LinkedList<>();
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original List:");
        printList(head);

        // Reverse the list
        Node reversedHead = reverseList(head);
        System.out.println("Reversed List:");
        printList(reversedHead);
    }

    // Time Complexity: O(n) — visits each node once
    // Space Complexity: O(1) — constant space
    public static Node reverseList(Node head) {

        // Cretae three var prev, curr and next
        Node prev = null;
        Node curr = head;
        Node next = null;

        while(curr != null){
            next = curr.next;   // Update next 
            curr.next = prev;   // Point to prev node 
            prev = curr;        // Update prev
            curr = next;        // Update curr
        }
        head = prev;

        return head;
    }
    
     public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
