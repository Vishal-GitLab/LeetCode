class Solution {
    public int findPairs(int[] arr, int k) {
        if(k<0) return 0;
          HashSet<Integer> set = new HashSet<>();
          HashSet<Integer> pairs = new HashSet<>();
       
         for (int ele : arr) {
            int rem  = ele - k;
             if (set.contains(ele - k)) {
              pairs.add(rem);
          }
          int rem2  = ele + k;    // check karega ki ele + k pehle se set mein hai ya nahi
          if (set.contains(rem2)) {
              pairs.add(ele);

          }
          set.add(ele);
       }
       return pairs.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna