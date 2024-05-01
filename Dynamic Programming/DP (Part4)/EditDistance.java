/* Edit Distance
 * Given two strings word1 and word2, return the minimum number of required to convert word1 to word2.
 * 
 * You have the following three operations permitted on a word:
 * - insert a character 
 * - delete a character 
 * - replace a character
 * 
 * word1 = "intention", word2 = "execution" ans = 5
 * intention -> intention (remove 't')
 * intention -> enention (replace 'i' with 'e')
 * enention -> exention (replace 'n' with 'x')
 * exention -> exention (replace 'n' with 'c')
 * exection -> excecution (insert 'u')
 */

public class EditDistance {
    public static int eDistance(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];

        //intialize
        for(int i=0; i<n+1; i++) {
            for(int j=0; j<m+1; j++) {
                if(i == 0) {
                    dp[i][j] = j;
                }
                if(j == 0) {
                    dp[i][j] = i;
                }
            }
        }
        //bottom up
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)) { //same
                    dp[i][j] = dp[i-1][j-1];
                } else {  //diff
                    int add = dp[i][j-1] + 1;
                    int del = dp[i-1][j] + 1;
                    int rep = dp[i-1][j-1] + 1;
                    dp[i][j] = Math.min(add, Math.min(del, rep));
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String args[]) {
        String word1 = "intention", word2 = "execution";
        System.out.println(eDistance(word1, word2));
    }
}