class Solution {
    public int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            int[][] eleIndex = new int[n][2];
            for (int i = 0; i < nums.length; i++) {
                eleIndex[i][0] = nums[i];
                eleIndex[i][1] = i;
            }
            Arrays.sort(eleIndex, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return Integer.compare(a[0], b[0]);
                }
            });
            int left=0,right=n-1;
            while(left<right) {
                int sum = eleIndex[left][0]+eleIndex[right][0];
                if(sum == target) {
                    return new int[]{eleIndex[left][1],eleIndex[right][1]};
                }
                else if(sum<target) 
                     left++;
                else
                   right--;
            }
            return new int[]{-1,-1};
        }
}