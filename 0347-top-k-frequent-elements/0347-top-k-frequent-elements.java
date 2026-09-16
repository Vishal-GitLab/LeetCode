import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Frequency count
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[1] - b[1]
        );

        // Step 3: Heap me elements daalo
        for (int num : map.keySet()) {

            pq.add(new int[]{num, map.get(num)});

            // Sirf K elements rakho
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Answer
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll()[0];
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna