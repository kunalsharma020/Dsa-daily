class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move one step
            fast = fast.next.next;  // Move two steps
        }

        return slow;  // Slow is now at the middle node
    }
}
