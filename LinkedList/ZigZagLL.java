
public class ZigZagLL {
 
    // Inner class should be static
    public static class Node {
        int data;
        Node next;
 
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
 
    public static Node head;
    public static Node tail;
 
 
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
 
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
 
 
   public void zigZag() {
    if (head == null || head.next == null) {
        return;
    }
 
    // Find mid
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    Node mid = slow;
 
    // Reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
 
    while (curr != null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextL, nextR;
 
    // Alt merge - zig-zag merge
    while (right != null) {
        nextL = left.next;
        left.next = right;
        nextR = right.next;
        right.next = nextL;
 
        left = nextL;
        right = nextR;
    }
}
 
    public static void main(String args[]) {
        ZigZagLL ll = new ZigZagLL(); // Corrected class name
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //1->2->3->4->5
        ll.print();
        ll.zigZag();
        ll.print();
    }
}
 
//O(nlogn)