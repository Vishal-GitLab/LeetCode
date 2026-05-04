class Solution {
    
     public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        Node curr = root;
        while(curr != null) {
            if(curr.left != null){
               // find pred and do work 
               Node pred = curr.left;
               while(pred.right!=null && pred.right != curr)
               pred = pred.right;
               if(pred.right == null) {  // link
                   pred.right = curr;
                   curr  = curr.left;
              }
               else{ // pred.right = curr // unlinked & print
                   pred.right = null;
                   ans.add(curr.data);
                   curr =  curr.right;
            }
        }
        else {
            ans.add(curr.data);
            curr =  curr.right;
           }
        }   
        return ans;
     

     }
     
}     



    //     Stack<Node> st  = new Stack<>();
    //     Node curr  = root;
    //     while(st.size()>0 || curr!= null) {
    //         if(curr !=  null) {
    //             if(curr.left != null) {
    //             st.push(curr);
    //             curr =  curr.left;
    //             }
    //             else{
    //                 ans.add(curr.data);
    //                 curr =  curr.right;
    //             }
    //         }
            
    //         else{  //  curr  ==  null 
    //              Node top = st.pop();
    //              ans.add(top.data);
    //              curr =  top.right;
    //         }
    //     }
    //     return ans; 
    // }
    
    
    
    
    
    // public void dfs(Node root, ArrayList<Integer> ans) {
    //     if(root == null) return;
    //     dfs(root.left,ans);
    //     ans.add(root.data);
    //     dfs(root.right,ans);

        
    // }
    // public ArrayList<Integer> inOrder(Node root) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     dfs(root,ans);
    //     return ans;
    // }
//}