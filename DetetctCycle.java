import java.util.HashSet;

public class DetetctCycle {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static boolean isCylce_bruteForce(Node head){
        HashSet<Node> hs = new HashSet<>();
        
        Node curr = head;
        while(curr != null){
            if(hs.contains(curr)){
                return true;
            }
            hs.add(curr);
            curr = curr.next;
        }

        return false;
    }

    public static boolean isCycle(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast ){
                return true;
            }
            
        }

        return false;

    }


    public static void main(String srgs[]){
        // int[] arr = {12,12,13,54,12,11,34,54};
        // isCycle(head);

        // 12,12,13,54
        Node head = new Node(12);
        head.next = new Node(12);
        head.next.next = new Node(13);
        head.next.next.next = new Node(54);

        // cretaed cycle 54 ----> 12
        head.next.next.next = head.next;
        System.out.println(isCycle(head));
        System.out.println(isCylce_bruteForce(head));
    }
}
