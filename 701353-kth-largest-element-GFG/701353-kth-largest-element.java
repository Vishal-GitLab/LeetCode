class Solution {
    // Function to return kth largest element from an array.
    public static int KthLargest(int arr[], int k) {
        // minheap 
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        for (int ele : arr) { // nlogk
            pq.add(ele); // logk 
        
        if(pq.size()>k) pq.remove(); // logk
        }
        return pq.peek();
        
    }
}