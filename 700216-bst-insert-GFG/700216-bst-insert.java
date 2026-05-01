class Solution {
    
    // Function to insert a node in a BST
    void attach(Node root, int key) {
        if(root==null)  return;
        if(root.data == key )  return;
        if(root.data < key ) {
            if(root.right == null)  root.right =  new Node(key);
            else attach(root.right, key);
        }
        else {  // root.data > data
            if(root.left == null)  root.left =  new Node(key);
            else attach(root.left, key);
            
        }
    }
    
    public Node insert(Node root, int key) {
           attach(root, key);
           return root;
    }

}
