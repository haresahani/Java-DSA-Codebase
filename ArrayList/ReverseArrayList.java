import java.util.ArrayList;
public class ReverseArrayList{
    public static void main(String args[]){
        //creating arrayList
        ArrayList<Integer> ArrayList = new ArrayList<>();

        ArrayList.add(1);
        ArrayList.add(2);
        ArrayList.add(3);
        ArrayList.add(4);
        ArrayList.add(5);
        ArrayList.add(6);

        System.out.println(ArrayList);

        //revese print --- O(n)
        for(int i=ArrayList.size()-1; i>=0; i--){
            System.out.print(ArrayList.get(i)+ " ");
        }
        System.out.println();
    }
}