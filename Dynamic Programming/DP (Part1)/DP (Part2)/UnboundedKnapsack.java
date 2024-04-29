public class UnboundedKnapsack {
    // Function to solve the unbounded knapsack problem
    public static int unbounded(int val[], int wt[], int W) {
        // Get the number of items
        int n = val.length;
        // Create a 2D array for the DP table
        int dp[][] = new int[n + 1][W + 1];

        // Initialize the base cases:
        // 1. 0 items: the maximum value is 0 for all capacities
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }
        // 2. 0 capacity: the maximum value is 0 for all items
        for (int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }

        // Fill the DP table
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                // Check if the weight of the current item is within the current capacity
                if (wt[i - 1] <= j) { // Valid weight
                    // Consider including the current item and update the maximum value
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
                } else { // Invalid weight
                    // If the weight of the current item exceeds the capacity, use the previous value
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        // Return the maximum value achievable with all items and the given capacity
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        // Calculate and print the maximum value achievable with the given weights and values
        System.out.println(unbounded(val, wt, W));
    }
}
