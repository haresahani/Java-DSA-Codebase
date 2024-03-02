/* Max Area in HistoGram
 * Given an array of integer representing the histogram the histogram's bar hight where the width of each bar is 1, return the area of the largest histogram rectangle int the histogram width.
 * Height=[2,1,5,6,2,3]
 * 
 * @microsoft, @paytm, @facebook
 */
import java.util.*;
public class HistoGram {
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length]; //nsr->next_smaller_right
        int nsl[] = new int[arr.length]; //nsl->next_smaller_right
        
        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        
        //next smaller left
        s.clear(); // Reuse the stack by clearing it
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        //current Area : width = j-i-1 = nsr[i]-nsl[i]-1;
        for(int i=0; i<arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Max area in histogram = " + maxArea);
    }
    public static void main(String arsg[]){
        int arr[] = {2, 1, 5, 6, 2, 3}; //height in histogram
        maxArea(arr);
    }
}