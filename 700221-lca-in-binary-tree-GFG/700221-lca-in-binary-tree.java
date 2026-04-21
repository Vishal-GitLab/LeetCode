
// class Solution {
//     Node lca(Node root, int p, int q) {
//         if(root == null ) return null;
//         if(root.data == p || root.data == q )  return root;
//         boolean pLiesInLeft  = exits(root.left,p);
//         boolean qLiesInLeft  = exits(root.left,q);
//         if(pLiesInLeft && qLiesInLeft)   return lca(root.left, p ,q);
//         else if(!pLiesInLeft && !qLiesInLeft)   return lca(root.right, p ,q);
//         else return  root;
        
//     }
    
//     private boolean  exits(Node root, int val) {
//         if(root ==  null)  return false;
//         if(root.data ==  val)  return true;
//         return exits(root.left, val) ||  exits(root.right, val);
        
//     }
// }

class Solution {
    Node lca(Node root, int p, int q) {
        if(root == null) return root;
        if(root.data == p || root.data == q) return root;
        Node l  = lca( root.left, p, q);
        Node r  = lca( root.right, p, q);
        if(l != null && r != null ) return root;
        return ( l ==  null) ? r:l;

    }
}