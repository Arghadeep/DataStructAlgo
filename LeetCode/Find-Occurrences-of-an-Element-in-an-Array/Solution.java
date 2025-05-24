class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> numOcList = new ArrayList<>();
        int i=0;
        for(int num: nums) {
            if(num == x) numOcList.add(i);
            i++;
        }
        int[] results = new int[queries.length]; i=0;
        if(numOcList.isEmpty()) {
            Arrays.fill(results, -1);
            return results;
        }
        i=0;
        for(int query: queries) {
            if(query > numOcList.size()){
                 results[i++] = -1;
            }
            else {
               results[i++] = numOcList.get(query-1);
            }
        }
        return results;
    }
}