class Solution {  

    Node deleteNode(Node head, int key) {
        if(head == null) return null;
        Node tail = head;
        // find tail
        while(tail.next != head) {
            tail = tail.next;
        }
        if(head == tail) {
            if(head.data == key) return null;
            else return head;
        }
        
        // delete node
        if(head.data == key) {
            head = head.next;
            tail.next = head;
            return head;
        }
        Node temp = head;
        Node temp2 = head.next;

        while(temp2 != head) {   
            if(temp2.data == key) {
                temp.next = temp2.next;
                break;
            }
            temp = temp.next;
            temp2 = temp.next;
        }

        return head;
    }        
}