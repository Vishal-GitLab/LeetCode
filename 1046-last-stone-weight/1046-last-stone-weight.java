class Solution {
      public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq  =  new PriorityQueue<>(Collections.reverseOrder());

        for (int ele: arr) {
            pq.add(ele);
        }
            while (pq.size()  > 1) {
               int x  = pq.poll();
               int y = pq.poll();

               if ( x!=y) {
                   pq.add(x-y);
               }
            }
         
     return pq.isEmpty() ? 0 : pq.poll();
}
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna