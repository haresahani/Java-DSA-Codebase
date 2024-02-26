public class LinkedList{
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

    //lec-3
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

    //lec-4
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

    //lec-5
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

    //lec-6
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
    //Remove First in LinkedList
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    //Remove Last in LinkedList
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
    
        // prev: i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = tail.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    //Search(Iterative)
    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not FoUnd
        return -1;
    }

    //Search(Recursive) //O(n)
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    //Reverse a linkedlist (iterative approach)
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Delete nth Node from End (--amazone--flipkart--adobe--qualcomm)
    public void deleteNthfromEnd(int n){
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; // remove first
            return;
        }
        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String[] args){
        LinkedList ll =  new LinkedList();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(4);
        ll.AddLast(5);
        ll.add(2, 3);
        // ll.print(); //1->2->3->4->5
        // // System.out.println(ll.recSearch(3));
        // // System.out.println(ll.recSearch(19));
        // ll.reverse();
        // ll.print();
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}