

class Solution {
        boolean isBST(Node root) {
         ArrayList<Integer>  arr  = new ArrayList<>();
         inorder(root,arr);
         for( int i = 1; i < arr.size(); i++) {
             if(arr.get(i) <= arr.get(i-1)) return false;
         }
         return true;
    }
    public void inorder(Node root, ArrayList<Integer>  arr) {
          if(root == null) return;
          inorder(root.left, arr);
          arr.add(root.data);
          inorder(root.right, arr);
 
    }
}