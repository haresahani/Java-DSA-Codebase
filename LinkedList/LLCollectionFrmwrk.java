
import java.util.LinkedList;
 
public class LLCollectionFrmwrk{
    public static void main(String args[]){
        //create-
        LinkedList<Integer> ll = new LinkedList<>();
 
        //Addd
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
 
        System.out.println(ll);
 
 
        //remove
        ll.removeLast();
        ll.removeFirst();
 
        System.out.println(ll);
 
 
    }
}