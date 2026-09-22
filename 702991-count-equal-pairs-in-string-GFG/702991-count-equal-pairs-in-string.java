class Solution {
   public int equalPairs(String s) {
         HashMap<Character,Integer> map = new HashMap<>();
         for (int i = 0; i <s.length(); i++) {
             char ch = s.charAt(i);
             map.put(ch, map.getOrDefault(ch,0)+1);
         }
         int pairs = 0;
         for (char ch : map.keySet()) {
             int freq= map.get(ch);
             pairs += freq*freq;
         }
         return  pairs;
     }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna