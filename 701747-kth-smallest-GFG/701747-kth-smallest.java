class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // maxheap 
        PriorityQueue<Integer> pq  = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : arr) { // nlogk
            pq.add(ele); // logk 
        
        if(pq.size()>k) pq.remove(); // logk
        }
        return pq.peek();
    }
}
        //     int n = arr.length;
        //   for (int i = 0; i < k; i++) {
        //     int min = Integer.MAX_VALUE;
        //     int mindex = -1;
        //     for (int j = i; j < n; j++) {
        //          if (arr[j] < min) {
        //              min = arr[j];
        //              mindex = j;
        //          }
        //     }
        //     int temp = arr[i];
        //     arr[i] = arr[mindex];
        //     arr[mindex] = temp;
        // }
        
        // return arr[k-1];
    //}
//}
