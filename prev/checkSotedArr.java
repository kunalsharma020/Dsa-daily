// class Solution {
//     public boolean check(int[] nums) {
//         int count = 0;
//         int n = nums.length;
        
//         for (int i = 1; i < n; i++) {
//             if (nums[i] < nums[i - 1]) {
//                 count++;
//             }
//         }
        

//         if (nums[n - 1] > nums[0]) {
//             count++;
//         }

//         return count <= 1;
//     }
// }




// class Solution {
    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}

// 2nd method

