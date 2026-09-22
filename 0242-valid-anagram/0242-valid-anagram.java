class Solution {
    public boolean isAnagram(String s1, String s2) {
         if (s1.length() != s2.length()) return false;
        HashMap<Character,Integer> map  = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (!map.containsKey(ch)) return false;
            int freq  = map.get(ch);
            if (freq == 0) return false;
            map.put(ch,freq-1);
         }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna