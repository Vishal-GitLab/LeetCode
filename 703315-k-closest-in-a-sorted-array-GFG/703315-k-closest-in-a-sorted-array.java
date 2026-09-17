
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
     return   this.val - p.val;
      }
}
class Solution {
    public ArrayList<Integer> findKClosest(int[] arr, int k, int x) {
       
        PriorityQueue<Pair> pq = new PriorityQueue<>( );
                 for (int ele : arr) {
                     if (ele == x) {
                            continue;
                        }
                     
                    int dist  =  Math.abs(ele - x);
                    pq.add(new Pair(dist,ele));
                     if (pq.size()>k) {
                        pq.poll();
                     }
                 }

                 ArrayList<Integer> ans   = new ArrayList<>();
                 while (!pq.isEmpty()) {
                     ans.add(pq.poll().val);

                 }
                   Collections.reverse(ans);

                   return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna