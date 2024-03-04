//Deque (Double ended Queue)
import java.util.*;
public class DequeB{
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1); //1
        deque.addFirst(2); // 1 2
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First ele = " + deque.getFirst());
        System.out.println("Last ele = " + deque.getLast());
 
    }
}