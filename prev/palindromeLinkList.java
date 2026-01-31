class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<>();

        // Step 1: Copy all elements from linked list to array
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        // Step 2: Check if array is a palindrome
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            if (!arr.get(i).equals(arr.get(j))) {
                return false;  // Not a palindrome
            }
            i++;
            j--;
        }

        return true;  // It is a palindrome
    }
}


// 2nd method

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true; // Single node is always palindrome
        
        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse the second half of the linked list
        ListNode prev = null;
        while (slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        
        // Step 3: Compare first half with reversed second half
        ListNode left = head, right = prev;
        while (right != null) { // Right half is smaller or equal in size
            if (left.val != right.val) return false;
            left = left.next;
            right = right.next;
        }
        
        return true; // If all elements matched, it's a palindrome
    }
}
