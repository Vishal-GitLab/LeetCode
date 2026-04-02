 
class Solution {
    
public Node reverse(Node head) {
       Node  pre =  null;
       Node  curr =  head;
       Node  fwd =  null;
       while(curr!=null){
           fwd = curr.next;
           curr.next = pre;
           curr.prev =  fwd;
           pre =  curr;
           curr  = fwd;
       }

       return pre;
   }
}