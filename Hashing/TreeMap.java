
import java.util.*;

public class TreeMp {
    public static void main(String args[]) {

        TreeMap<String, Integer> tm = new TreeMap<>();

        // Adding elements to the LinkedHashMap
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 5);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        tm.put("Indonesia", 5);
        // Printing the LinkedHashMap
        System.out.println(tm);
        System.out.println(hm);
    }
}
