class Solution {
    public Node delNode(Node root, int target) {
        if(root == null)  return null;
        if(root.data > target) // go left
        root.left = delNode(root.left, target);
        else if(root.data < target) // go right
        root.right = delNode(root.right, target);
        
        
        else {   // root.data == target
            // case 1  (leaf node)
            if(root.left == null && root.right == null)  return null;
            // case 2 (1 child node)
            if(root.left ==  null ) return root.right;
            if(root.right ==  null ) return root.left;
            
            // case 3 (2 child node)
            Node succ = root.right;
            while(succ.left !=null) succ  = succ.left;
            root.right =  delNode(root.right, succ.data);   // left subt. me jaha pred ka data dikh rh h delete krke a jayega
            succ.left = root.left;
            succ.right = root.right;
            return succ;
        }
        return root;
    }
}