class Solution {
    public int[] findMinMax(int[] nums) {
        int max = nums[0], min = nums[0];
        
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        return new int[]{max, min};
    }
}
