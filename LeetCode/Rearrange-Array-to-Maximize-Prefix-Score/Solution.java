class Solution {
    public int maxScore(int[] num) {
        Integer[] boxedArr = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArr, Comparator.reverseOrder());
        int[] nums = Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
        int sum=0;
        long p=0;
        for(int i:nums)
        {
            p+=(long)i;
            if(p>0)
            {
                sum++;
            }
            else
            {
                p=0;
            }
        }
        return sum;
    }
}