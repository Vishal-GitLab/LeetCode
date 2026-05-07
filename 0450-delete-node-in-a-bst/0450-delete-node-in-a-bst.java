class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)  return null;
        if(root.val > key) // go left
        root.left = deleteNode(root.left, key);
        else if(root.val < key) // go right
        root.right = deleteNode(root.right, key);
        
        else {   // root.data == target
            // case 1  (leaf node)
            if(root.left == null && root.right == null)  return null;
            // case 2 (1 child node)
            if(root.left ==  null ) return root.right;
            if(root.right ==  null ) return root.left;
            
            // case 3 (2 child node)
            TreeNode succ = root.right;
            while(succ.left !=null) succ  = succ.left;
            root.right =  deleteNode(root.right, succ.val);   // left subt. me jaha pred ka data dikh rh h delete krke a jayega
            succ.left = root.left;
            succ.right = root.right;
            return succ;
        }
        return root;
    }
}