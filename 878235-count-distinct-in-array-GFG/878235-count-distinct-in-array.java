class Solution {
  public int countDistinct(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele:arr) {
            set.add(ele);

        }
     return set.size();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna