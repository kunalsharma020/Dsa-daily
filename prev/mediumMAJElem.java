import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        
        // The middle element is always the majority element
        return nums[nums.length / 2];
    }
}
