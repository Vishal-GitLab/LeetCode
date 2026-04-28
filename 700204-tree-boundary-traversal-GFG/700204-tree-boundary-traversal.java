class Solution {
    ArrayList<Integer> boundaryTraversal(Node root) {
          ArrayList<Integer> ans =  new  ArrayList<>();
          ans.add(root.data);
          if(root.left  == null && root.right == null) return ans;
          leftBoundary(root.left,ans);
          leafNode(root,ans);
          rightBoundary(root.right,ans);
          return ans;
    }
    
    void leftBoundary(Node root,ArrayList<Integer> ans ){
        if(root == null) return;
        if(root.left  == null && root.right == null) return;
        ans.add(root.data);
        if(root.left != null)   leftBoundary(root.left,ans);
        else leftBoundary(root.right,ans);
    }
    void leafNode(Node root,ArrayList<Integer> ans ){
        if(root == null) return;
        if(root.left  == null && root.right == null) ans.add(root.data);;
         leafNode(root.left,ans);
            leafNode(root.right,ans);
    }
        
    void rightBoundary(Node root,ArrayList<Integer> ans ){
        if(root == null) return;
        if(root.left  == null && root.right == null) return;
        if(root.right != null)   rightBoundary(root.right,ans);
        else rightBoundary(root.left,ans);
            ans.add(root.data);
    }
}