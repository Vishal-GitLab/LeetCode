class Solution {
    public int toggleBits(int n, int l , int r) {
       for(int i = l ; i<= r; i++) {
           n  = n^(1<<(i-1));
       }
       return n;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna