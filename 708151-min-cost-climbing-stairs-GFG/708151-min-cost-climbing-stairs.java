 

class Solution {
   static  int[] dp;
     static int minCostClimbingStairs(int[] cost) {
       int  n = cost.length;
       dp = new int[n];  // 0 to  n-1
         Arrays.fill(dp, -1); //mark

         return (int) Math.min(minCost(0,cost),minCost(1,cost));  // yha sirf ak bar hi chalega 0 aur ye 1 ko store kra dega aur jab 1 chlega to isi 0 ki ki sotre hui ki value ko store kra dega 

     }

     private static double minCost(int i, int[] cost) {
         if (i >= cost.length) return 0;
         if (dp[i] != -1) return dp[i];

         return dp[i] = (int) (cost[i] + Math.min(minCost(i+1,cost),minCost(i+2 ,cost)));
     }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna