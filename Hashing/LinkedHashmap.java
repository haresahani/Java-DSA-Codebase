import java.util.*;

public class LinkedHashmap {
    public static void main(String args[]) {
        // Creating a new instance of LinkedHashMap with String keys and Integer values
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        // Printing the LinkedHashMap
        System.out.println(lhm);
        System.out.println(hm);
    }
}
