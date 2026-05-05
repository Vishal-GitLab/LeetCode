
class Solution{
       boolean isBST(Node root){
          Node curr = root;
          int prev = 0;
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
                   if(curr.data <= prev)  return false;
                   prev =  curr.data;
                   curr =  curr.right;
            }
        }
        else {
             if(curr.data <= prev)  return false;
                   prev =  curr.data;
                   curr =  curr.right;
           }
        }   
        return true;
     
  }
}

//  class Pair{
//     int max;
//     int min;
//      Pair(int max, int min) {
//         this.max =  max;
//         this.min = min;
//     }
// }

// class Solution {
//     static boolean flag;
//     boolean isBST(Node root){
//         flag = true;
//         maxMin(root);
//         return flag;
//     }
//   Pair maxMin(Node root) {
//       if(root == null) return new Pair(Integer.MIN_VALUE,Integer.MAX_VALUE);
//       Pair lst  = maxMin(root.left);
//         Pair rst  = maxMin(root.right);
//         //ab left subtree and right subtree and root ka max and min nikalenge
//         int max  = Math.max(root.data,Math.max(lst.max,rst.max));
//           int min  = Math.min(root.data,Math.min(lst.min,rst.min));
//           if(lst.max>= root.data || rst.min <= root.data)
//           flag =false;
//           return new Pair(max,min);
//   }

// }    




    //     boolean isBST(Node root) {
    //      ArrayList<Integer>  arr  = new ArrayList<>();
    //      inorder(root,arr);
    //      for( int i = 1; i < arr.size(); i++) {
    //          if(arr.get(i) <= arr.get(i-1)) return false;
    //      }
    //      return true;
    // }
    // public void inorder(Node root, ArrayList<Integer>  arr) {
    //       if(root == null) return;
    //       inorder(root.left, arr);
    //       arr.add(root.data);
    //       inorder(root.right, arr);
 
    // }
 // }