// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;
public class SortingArrayList{
    public static void main(String[] args){
        // creating arrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(11);
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(7);

       System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}