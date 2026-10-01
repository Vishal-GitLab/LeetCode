class Solution {
         public int fib(int n) {
          if(n<=1) return n; 
          int[] dp  = new int[3];   
          dp[1] = 1;
           for(int i = 2; i <=n; i++) {
           dp[2] = dp[1]  + dp[0];
            dp[0] =  dp[1];
            dp[1] =  dp[2];
      }
      return dp[2];
     }
}

    //  public int fib(int n) {
    //  int[] dp  = new int[n+1];  // idx from 0 to 1
    //   if(n>=1) dp[1] = 1;
    //   for(int i = 2; i <= n; i++) {
    //       dp[i] = dp[i-1] + dp[i-2];    // ye upar se niche chalke count hoga
    //   }
    //   return dp[n];

    //  }
//}



    //  static int[] dp;
    // public int fibo(int n ) {
    //     if(n<=1) return n;
    //     if(dp[n] != 0) return dp[n];   
    //     int ans = fibo(n-1) + fibo(n-2);
    //     dp[n] =  ans;
    //     return ans;
    // }
    // public int fib(int n) {
    //  dp = new int[n+1];  //idx from 0 to 1
    //    return fibo(n);
    // }
//}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna