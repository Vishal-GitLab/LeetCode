class Solution {
    public List<Integer> findMissingElements(int[] arr) {
      ArrayList<Integer> ans  = new ArrayList<>();
        HashSet<Integer> set =  new HashSet<>();
        for (int ele:arr) {
            set.add(ele);
        }
        int low = Integer.MAX_VALUE;
        int high =  Integer.MIN_VALUE;
        for (int ele :arr) {
            low =Math.min(low,ele);
            high = Math.max(high,ele);
        }
        for (int i = low; i <= high; i++) {
            if (!set.contains(i)) ans.add(i);
        }
        return ans;
         
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna