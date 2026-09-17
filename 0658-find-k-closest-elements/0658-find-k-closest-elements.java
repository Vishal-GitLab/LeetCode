class Pair implements  Comparable<Pair> {
    int dist;
    int val;

    Pair(int dist, int val) {
        this.dist = dist;
        this.val = val;

    }
    public int compareTo(Pair p) {
       if (this.dist != p.dist) {
        return p.dist - this.dist;
        }
     return p.val - this.val;
      }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
           PriorityQueue<Pair> pq = new PriorityQueue<>( );
            for (int ele : arr) {
               int dist  =  Math.abs(ele - x);
               pq.add(new Pair(dist,ele));
                if (pq.size()>k) {
                   pq.remove();
                }
            }

            List<Integer> ans   = new ArrayList<>();
            while (!pq.isEmpty()) {
                ans.add(pq.remove().val);
                  
            }
              Collections.sort(ans);

              return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna