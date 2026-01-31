class Solution{
    public int missingNumber(int[] nums){
        int n=nums.length;
        int expectedNo=n*(n+1)/2;
        int actualSum=0;

        for(int num: nums){
            actualSumm += num;
        }
        return expectedNo - actualSum;
    }
}