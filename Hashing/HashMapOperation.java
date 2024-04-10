
//Hashmap Operation;
import java.util.*;
public class HashMapOperation{
    public static void main(String args[]){
        //create
        HashMap<String, Integer> hm = new HashMap<>();
 
        //insert
        hm.put("India", 100);
        hm.put("china", 150);
        hm.put("us", 50);
 
        System.out.println(hm);
 
 
       /* //get - 0(1)
        int population = hm.get("India");
        System.out.println(population);
 
        System.out.println(hm.get("Indonesia"));
 
        //Containskey - 0(1)
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Indonesia")); //false
        */
 
       /* //remove
        System.out.println(hm.remove("India"));
        System.out.println(hm);
        */
 
        //size
        System.out.println(hm.size());
 
        //is empty
        hm.clear();
        System.out.println(hm.isEmpty());
     }
}