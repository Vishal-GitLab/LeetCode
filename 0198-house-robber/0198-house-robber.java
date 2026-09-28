class Solution {
    static int[] dp;
    public int rob(int[] arr) {
         int n = arr.length;
           dp  = new int[n];        // 0 to n-1
           Arrays.fill(dp,-1);   // mark
           return loot(0,arr);
    }
     private int loot(int i, int[] arr) {
           if (i>= arr.length) return 0;
           if (dp[i] != -1) return dp[i];
           int pick  = arr[i] + loot(i+2,arr);
           int skip = loot(i+1, arr);
            // int ans = Math.max(pick,skip);
            // dp[i] = ans;
            // return ans;
             return dp[i] = Math.max(pick,skip);
       }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna