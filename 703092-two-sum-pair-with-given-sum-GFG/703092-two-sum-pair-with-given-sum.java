class Solution {
    boolean twoSum(int arr[], int target) {
             HashSet<Integer>  set = new HashSet<>();
             for(int ele :arr) {
                 int rem = target - ele;
                 if (set.contains(rem) ) return true;     // agar yhi se mil jayega to true return kar dega
                    set.add(ele);
                 
             }
             return false;
         }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna