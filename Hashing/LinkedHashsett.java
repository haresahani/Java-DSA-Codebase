
import java.util.*;
public class LinkedHashsett{
    public static void main(String args[]){
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bangaluru");
        System.out.println(cities);
 
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bangaluru");
        System.out.println(lhs);
    }
}