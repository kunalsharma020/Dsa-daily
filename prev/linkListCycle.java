class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false; // Edge case: Empty list or single node

        ListNode slow = head;  // Moves one step
        ListNode fast = head;  // Moves two steps

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow pointer one step
            fast = fast.next.next;  // Move fast pointer two steps

            if (slow == fast) return true; // Cycle detected
        }

        return false; // No cycle found
    }
}