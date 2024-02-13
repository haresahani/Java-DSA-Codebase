import java.util.ArrayList;
public class OperationsOnArraList{
    public static void main(String Args[]){
       ArrayList<Integer> list = new ArrayList<>();

       /*add element O(1) */
        list.add(1);
        list.add(2);
        list.add(3); 

        list.add(0, 11);
        System.out.println(list);
 
        /*get element O(1) */
        // int element = list.get(2);
        // System.out.println(element);

        /*remove/delete element O(n) */
        // list.remove(2);
        // System.out.println(list);

        /* set element at index O(n) */
        // list.set(2,12);
        // System.out.println(list);

        /*contains element O(n) */
        // System.out.println(list.contains(2)); //true
        // System.out.println(list.contains(17)); //false
    }
}