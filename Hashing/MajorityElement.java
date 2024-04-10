/* Majority Element
 * Given an integer array of size n, find all elements that appear more than[n/3] times.
 * 
 * nums[] = {1, 3, 2, 5, 1, 3, 1, 5, 1}
 * //1
 * 
 * nums[] = (1, 2);
 * //1, 2
 * 
 */

import java.util.*;

public class MajorityElement {
    public static void main(String[] args){
        int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i= 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }    
}
//O(n)