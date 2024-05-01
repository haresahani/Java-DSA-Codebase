
public class StringConversion {
    public static int conversion(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        
        // Create a 2D array to store the edit distance
        int[][] dp = new int[m + 1][n + 1];
        
        // Initialize the base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; 
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; 
        }
        
    
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; 
                } else {
                    int insertion = dp[i][j - 1] + 1;
                    int deletion = dp[i - 1][j] + 1;
                    dp[i][j] = Math.min(insertion, deletion);
                }
            }
        }
        
        return dp[m][n];
    }
    
    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        
        System.out.println(conversion(str1, str2));
    }
}
