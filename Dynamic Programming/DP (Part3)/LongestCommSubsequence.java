/* Longest Common subsequence
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 * 
 * str1 = "abcde", str2 = "ace"
 * ans = 3 //"ace"
 * str1 = "abcdge", str2 = "abedg"
 * ans = 4 //"abdg"
 */
public class LongestCommSubsequence {
    public static int lcs(String str1, String str2, int n, int m){
        if(n == 0 || m == 0) {
            return 0;
        }

        if(str1.charAt(n-1) == str2.charAt(m-1)) { //same
            return lcs(str1, str2, n-1, m-1) + 1;
        } else { // different 
        int ans1 = lcs(str1, str2, n-1, m);
        int ans2 = lcs(str1, str2, n, m-1);
        return Math.max(ans1, ans2);
        }
    }
    public static void main(String args[]) {
        String str1 = "abcdge";
        String str2 = "abedg"; //lcs = "abdg"; length = 4
        System.out.println(lcs(str1, str2, str1.length(),str2.length()));
    }
}
