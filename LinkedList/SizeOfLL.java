
public class SizeOfLL{
    public static class Node{
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;    //for size calculation

    public void AddFirst(int data){
        //Step1 = create new node
        Node newNode = new Node(data);
        size++; //for size calculation
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 - newNode next = head
        newNode.next = head; //link

        // step3 - head = newNode
        head = newNode; 
    }
    public void AddLast(int data){
        Node newNode = new Node(data);
        size++; //for size calculation
        if(head==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx, int data){

        if(idx == 0){
            AddFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;  //for size calculation
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }

        //i = idx-1 temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public static void main(String[] args){
        SizeOfLL ll =  new SizeOfLL();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.add(2, 3);
        ll.print(); //1->2->3->4->5
        System.out.println(ll.size);  //for size calculation output
    }
}