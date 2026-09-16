 class Solution {
        class Pair implements Comparable<Pair> {      // hma pair ke liye comparable krenge
            int num,count;
            Pair(int num, int count) {
                this.num = num;
                this.count = count;
            }
            @Override
            public int compareTo(Pair b) {
                return this.count-b.count;
            }
        }
        
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer,Integer> mp  = new HashMap<>();
            // ab frequent find karenge
            for(int num:nums) {
                mp.put(num,mp.getOrDefault(num,0)+1);  // jtni bar value occur gyi hai usko layega hash map me
            }
            PriorityQueue<Pair> pq =  new PriorityQueue<>();
            // ab hme data nikal kar add karna padega
            // sare key lake de dega ye
            Set<Integer>  keys = mp.keySet();
            for (int key : keys) {
                if(pq.size()  < k) {
                    pq.add(new Pair(key,mp.get(key)));
                }
                    // jokam frequency wale element hai usko delete kar dega
                    else if(pq.peek().count < mp.get(key)) {
                        pq.poll();   // jo top ka element hai vo delete ho jayega
                        pq.add(new Pair(key,mp.get(key)));
                    }
                }
                int[] arr =  new int[k];
                int  i  = k-1;
                while (i>=0)
                    arr[i--] = pq.poll().num;
               
          return arr;
           }
 }
    


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna