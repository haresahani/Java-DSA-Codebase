/* We are given an infinite supply of denomination [1, 2, 5, 10, 20, 50, 100, 2000].
 * Find min no. of coins.notes to make change for a value Value V
 * 
 * V = 121
 * ans = 3 (100+20+1)
 * 
 * V = 590
 * ans = 4 (500+50+20+20)
 */
import java.util.*;
public class IndianCoins {
    public static void main(String args[]){
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total (min) coins used = " + countOfCoins);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
