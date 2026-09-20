
class Solution {
  int countPairs(int[] arr, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      int count = 0;
      for (int ele : arr) {
          int rem  = ele - k;
          if (map.containsKey(rem)) {
              count+= map.get(rem);
          }
          int rem2  = ele + k;    // ye check karega kya pahle se koi element aa gya ha (ele-k) ka 
          if (map.containsKey(rem2)) {
              count+= map.get(rem2);

          }
          map.put(ele,map.getOrDefault(ele,0) +1);
      }
       return count;
  }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna