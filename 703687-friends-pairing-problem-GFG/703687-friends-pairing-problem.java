class Solution {
    public long countFriendsPairings(int n) {
           long[]  dp = new long[n+1];
           return friend(n,dp);
       }

       private long friend(int n, long[] dp) {
           if (n<= 2) return n;
           if (dp[n] != 0) return dp[n];

           return  dp[n] = friend(n-1,dp) + (n-1)*friend(n-2,dp);
       }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna