class Solution {

    // public int uniquePaths(int m, int n) {
    //     if(m == 1 || n == 1) return 1;
    //     return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    // }

 public int uniquePaths(int m, int n) {
     int[][]  dp = new int[m+1][n+1]; // rows -> 0 to m, cols -> 0 to n
         return paths(m,n,dp);
     }

     private int paths(int m, int n, int[][] dp) {      // m to 1, n to 1
         if (m==1 || n==1) return 1;
         if (dp[m][n] != 0) return dp[m][n];

         return dp[m][n] =  paths(m-1,n,dp) +  paths(m,n-1,dp);
     }
    // if(m==1 && n==1) return 1;
    // if(m==0 || n==0) return 0;
    // return uniquePaths(m,n-1) + uniquePaths(m-1,n);
 
  }


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna