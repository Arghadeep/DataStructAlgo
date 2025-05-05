class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int start = 0, counter=0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            map.put(c, map.getOrDefault(c, 0)+1);
            if(map.get(c) == 1) counter++;
            while(counter>k) {
                char cTemp = s.charAt(start);
                map.put(cTemp, map.get(cTemp)-1);
                if(map.get(cTemp) == 0) {
                    counter--;
                }
                start++;
            }
            maxLen = Math.max(maxLen, end-start+1);
        }
        return maxLen;
    }
}