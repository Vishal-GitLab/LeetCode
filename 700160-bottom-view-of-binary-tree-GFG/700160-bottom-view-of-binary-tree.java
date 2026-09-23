 
 
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        
                     HashMap<Integer,Integer> map = new HashMap<>();
                     Queue<Node> q  = new LinkedList<>();
                     Queue<Integer> hd = new LinkedList<>();
                           q.add(root);
                           hd.add(0);
                     
                     int minDist  = Integer.MAX_VALUE, maxDist = Integer.MIN_VALUE;
                     while (!q.isEmpty()) {
                         Node node  = q.remove();
                         int dist = hd.remove();
                         minDist =  Math.min(dist,minDist);
                         maxDist =  Math.max(dist,maxDist);
                         map.put(dist,node.data); // work
                         if (node.left != null){
                             q.add(node.left);
                              hd.add(dist - 1);
                         }  
                          if (node.right != null) {
                             q.add(node.right);
                              hd.add(dist + 1);
                         }   
                     }
                      ArrayList<Integer> ans  = new ArrayList<>(maxDist-minDist + 1);
                     for (int i = minDist; i <= maxDist; i++) {
                         ans.add(map.get(i));
                     }
                     return ans;
 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna