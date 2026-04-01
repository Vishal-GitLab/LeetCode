
class Solution {
    public static Node reverse(Node head) {
         Node pre = null;
         Node curr = head;
         Node fwd= head;
         while(curr!=null) {
             fwd =  curr.next;
             curr.next = pre;
             pre =  curr;
             curr = fwd;
         }
         return pre;
    }
    public static Node reverseBetween(int l, int r, Node head) {
        Node dummy = new Node(-1);
        Node temp   = dummy;
        dummy.next  = head;
        for(int  i = 1; i<=l-1;i++) {
            temp  = temp.next;
        }
        Node tail1 = temp;
        Node head2 =  temp.next;
        
        for(int i = 1; i <= r-l+1; i++) {
            temp =  temp.next;
        }
        
        Node tail2  = temp;
        Node head3 =  temp.next;
        
        tail1.next =  null;
        tail2.next =  null;
        
        reverse(head2);
        
        tail1.next = tail2;
        head2.next = head3;
        
        return dummy.next;
    }
}