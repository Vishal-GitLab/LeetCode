class Solution {
    public int[] sortArray(int[] arr) {
      PriorityQueue<Integer> pq  = new PriorityQueue<>();
      for(int ele: arr) {
          pq.add(ele);
      }
       int idx = 0;
          while(pq.size() > 0) arr[idx++] = pq.remove(); 
      return arr;
    }
}