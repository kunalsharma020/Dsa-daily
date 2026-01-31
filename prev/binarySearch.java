class Solution {
   
    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid; // Target found, return index
            } else if (nums[mid] < target) {
                left = mid + 1; // Search in right half
            } else {
                right = mid - 1; // Search in left half
            }
        }
        return -1; // Target not found
    }
}

// 