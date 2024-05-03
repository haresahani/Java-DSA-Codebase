import java.util.*;
public class MatrixChainMultiplicationRec { 
    public static int mca(int arr[], int i, int j) {
        if(i == j) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        for(int k=i; k<=j-1; k++) {
            int cost1 = mca(arr, i, k); //Ai.. cost => arr[i-1] * arr[k]
            int cost2 = mca(arr, k+1, j); //Ai+1...Aj => arr[k]*arr[j]
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;
            ans = Math.min(ans, finalCost);
        }
        return ans; // mincost
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 3}; //n=5
        int n = arr.length; 
        System.out.println(mca(arr, 1, n-1));
    }
}
