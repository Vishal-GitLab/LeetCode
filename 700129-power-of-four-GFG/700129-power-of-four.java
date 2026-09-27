class Solution {
   boolean isPowerOfTwo(long n) {
          return n>0 && (n  & (n-1))==0 ;
      }

      boolean isSquare(long n){
          long root  = (long) (Math.sqrt(n));
          return (root*root == n);
       }
      boolean isPowerOfFour(int n) {
         return (isPowerOfTwo(n) && isSquare(n));
      }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna