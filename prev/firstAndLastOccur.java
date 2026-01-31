class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i; // First time target is found
                }
                last = i; // Keep updating last as we go
            }
        }

        return new int[]{first, last};
    }
}
