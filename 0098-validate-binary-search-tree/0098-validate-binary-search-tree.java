class Solution {
    boolean isValidBST(TreeNode root){
          TreeNode curr = root;
          long prev = Long.MIN_VALUE;
         while(curr != null) {
            if(curr.left != null){
               // find pred and do work 
               TreeNode pred = curr.left;
               while(pred.right!=null && pred.right != curr)
               pred = pred.right;
               if(pred.right == null) {  // link
                   pred.right = curr;
                   curr  = curr.left;
              }
               else{ // pred.right = curr // unlinked & print
                   pred.right = null;
                   if(curr.val <= prev)  return false;
                   prev =  curr.val;
                   curr =  curr.right;
            }
        }
        else {
             if(curr.val <= prev)  return false;
                   prev =  curr.val;
                   curr =  curr.right;
           }
        }   
        return true;
   }
}




//  class Pair{
//     long max;
//     long min;
//      Pair(long max, long min) {
//         this.max =  max;
//         this.min = min;
//     }
// }

// class Solution {
//     static boolean flag;
//     boolean isValidBST(TreeNode root){
//         flag = true;
//         maxMin(root);
//         return flag;
//     }
//   Pair maxMin(TreeNode root) {
//       if(root == null) return new Pair(Long.MIN_VALUE,Long.MAX_VALUE);
//       Pair lst  = maxMin(root.left);
//         Pair rst  = maxMin(root.right);
//         //ab left subtree and right subtree and root ka max and min nikalenge
//         long data = (long)(root.val);
//         long max  = Math.max(data,Math.max(lst.max,rst.max));
//           long min  = Math.min(data,Math.min(lst.min,rst.min));
//           if(lst.max>= data || rst.min <= data)
//           flag =false;
//           return new Pair(max,min);
//   }

// } 







//     public boolean isValidBST(TreeNode root) {
//          ArrayList<Integer>  arr  = new ArrayList<>();
//          inorder(root,arr);
//          for( int i = 1; i < arr.size(); i++) {
//              if(arr.get(i) <= arr.get(i-1)) return false;
//          }
//          return true;
//     }
//     public void inorder(TreeNode root, ArrayList<Integer>  arr) {
//           if(root == null) return;
//           inorder(root.left, arr);
//           arr.add(root.val);
//           inorder(root.right, arr);
 
//     }
// }