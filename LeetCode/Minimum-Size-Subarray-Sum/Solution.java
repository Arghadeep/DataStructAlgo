class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minSubArrayLen = Integer.MAX_VALUE;
        int subArraySum = 0;
       for(int i=0,j=0; j< nums.length; j++){
        subArraySum += nums[j];
            while(subArraySum >= target) {
                minSubArrayLen = Math.min(minSubArrayLen, j-i+1);
                subArraySum -= nums[i++];
            }
        }
       return minSubArrayLen == Integer.MAX_VALUE ? 0 : minSubArrayLen; 
    }
}