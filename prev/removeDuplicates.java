class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;  // Start from 1 because the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            // If the current number is different from the previous one
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];  // Place it at the next unique position
                k++;                // Move the unique counter
            }
        }

        return k;  // Return the number of unique elements
    }
}
