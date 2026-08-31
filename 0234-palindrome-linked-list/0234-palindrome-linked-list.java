 
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head  == null) return true;
        ListNode slow = head;
        ListNode fast  = head;
        ListNode next;
        ListNode  current =  slow.next;
        ListNode prev =  null;
         while(fast.next!= null  && fast.next.next!=null) {
            slow =  slow.next;
            fast = fast.next.next;
             
         }
          current = slow.next;
         while(current != null) {
        next  =  current.next;
        current.next = prev;
        prev = current;
        current = next; 
         }

         while(prev != null){
            if(head.val != prev.val) {
                return false;
            }
             head = head.next;
           prev= prev.next;
         }
      return true;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna