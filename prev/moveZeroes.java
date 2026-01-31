class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0; // Position to place non-zero numbers

        // Move all non-zero numbers to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill the rest of the array with zeroes
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
