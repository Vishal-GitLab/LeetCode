// class KthLargest {

     
class KthLargest {

    PriorityQueue<Integer> pq;
    int k;

    public KthLargest(int k, int[] nums) {

        this.k = k;
        pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    public int add(int val) {

        pq.add(val);

        if (pq.size() > k) {
            pq.poll();
        }

        return pq.peek();
    }
}
    // public KthLargest(int k, int[] nums) {
        
    // }
    
    // public int add(int val) {
        
    // }

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna