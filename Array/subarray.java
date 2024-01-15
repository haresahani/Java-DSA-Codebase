import java.util.*;
public class subarray{
    //function for sub array 
    public static void subArray(int numbers[]){
        int totalsubArray = 0;  //calculating total subArray
        
        for(int i=0; i<numbers.length; i++){
          
            int subArraySum =0;   //calculating subArray Sum
            
            for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                    subArraySum += numbers[k];
                }
                System.out.print("(Sum = " + subArraySum + ")"); //Total subarray sum
                totalsubArray++;   //calculating total subArray
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subArray: " + totalsubArray);
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10};
        subArray(numbers);
    }
}