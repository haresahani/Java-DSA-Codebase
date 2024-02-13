/* Find Maximum in an ArrayList */

import java.util.ArrayList;
public class FindMaxArrayList{
    public static void main(String args[]){
        //creating arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(11);
        list.add(9);

        int max = Integer.MIN_VALUE;  // max = -∞ (Integer.MIN_VALUE)
        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max element: "+max);
    }
} //O(n)