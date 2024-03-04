
/* Next Greater Element
 * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
  
 * arr = [6, 8, 0, 1, 3]
 * next Greater = [8, -1, 1, 3, -1]
 */
import java.util.Stack;

public class NextGreaterEle {
    public static void main(String args[]) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // Step 1: Pop elements from the stack while they are smaller than or equal to arr[i]
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // Step 2: If stack is empty, set nextGreater[i] to -1, else set it to the element at stack's top
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()];
            }

            // Step 3: Push the current index i into the stack
            s.push(i);
        }

        // Printing the nextGreater array
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
    }
}


//try these 4 problems related to the next greater element
/* next Greater right
 * next greater left
 * next smaller right 
 * next smaller left
 * for any help watch tutorial of stack topic/chapter
 */