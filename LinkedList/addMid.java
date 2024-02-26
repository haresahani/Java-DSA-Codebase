public class addMid {

    //initialize
    //addfirst
    //addlast
    //print
    public void add(int idx, int data){
        
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
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
        LinkedList ll =  new LinkedList();
        ll.AddFirst(2);
        ll.AddFirst(1);
        ll.AddLast(3);
        ll.AddLast(4);
        ll.add(2, 9);
        ll.print();
    }
}
}
