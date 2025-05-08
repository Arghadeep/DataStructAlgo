class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(int j=0; j<nums.length; i++) {
            if(i!=nums[j++]) return i;
        }
        return i;
    }
}