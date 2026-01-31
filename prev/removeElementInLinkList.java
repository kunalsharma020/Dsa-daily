class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next; 
            } else {
                current = current.next; 
            }
        }
        return head; 
    }
}


// //  for some cases
// // Definition for singly-linked list (ONLY if required)
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode(int val) { this.val = val; }
// }
