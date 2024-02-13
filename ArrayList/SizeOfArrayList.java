import java.util.ArrayList;
public class SizeOfArrayList{
    public static void main(String[] args){
        //creating arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  //0
        list.add(2);  //1
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        System.out.println(list.size());


        //print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();
    }
}