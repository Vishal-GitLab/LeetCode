
class Solution {
        // User defined Pair class for heap elements
        class Pair implements Comparable<Pair> {     
            int ele;
            int freq;
            Pair(int ele, int freq) {
                this.ele=ele;
                this.freq=freq;
            }
            public int compareTo(Pair p) {
                if(this.freq==p.freq)  return this.ele - p.ele;      // ye ele ke base par hame shor karke de dega 
                return this.freq - p.freq;         // ye freq ke base par hamko short karke de dega 
            }
        } 

    public ArrayList<Integer> topKFreq(int[] arr, int k) {
     
         HashMap<Integer,Integer> map  = new HashMap<>();
                    for(int ele:arr) {
                        map.put(ele,map.getOrDefault(ele,0)+1);   
                    }
                    PriorityQueue<Pair> pq =  new PriorityQueue<>();
                    for (int ele: map.keySet()) {
                        int freq = map.get(ele);
                            pq.add(new Pair(ele,freq));
                            if(pq.size() > k) pq.remove();
                        }

                          ArrayList<Integer> ans = new ArrayList<>();
                          while(pq.size() > 0) {
                              Pair top = pq.remove();
                              ans.add(top.ele);
                          }
                          
                          Collections.reverse(ans);

                          return ans;
     
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna