class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i = nums2.length-1; i >= 0; i--) {
             while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            if(st.empty() )    map.put(nums2[i], -1);
            else map.put(nums2[i], st.peek()) ;
            st.push(nums2[i]); 
         }
          
    

    // num1 ka answer
           int[] ans =  new int[nums1.length];
           for(int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
           }
           return ans;
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna