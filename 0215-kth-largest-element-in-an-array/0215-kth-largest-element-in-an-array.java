class Solution {
    public int findKthLargest(int[] arr, int k) {
          // minheap 
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        for (int ele : arr) { // nlogk
            pq.add(ele); // logk 
        
        if(pq.size()>k) pq.remove(); // logk
        }
        return pq.peek();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna