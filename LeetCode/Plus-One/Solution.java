class Solution {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length-1;
        if(digits[lastIndex] < 9) digits[lastIndex]++;
        else {
            while(lastIndex >= 0 && digits[lastIndex] == 9) {
                digits[lastIndex--] = 0;
            }
            if(lastIndex >= 0) digits[lastIndex]++;
            else {
                int newDigits[] = new int[digits.length+1];
                newDigits[0] = 1; int i=0, j=1;
                while(i <= digits.length-1){
                 newDigits[j++]=digits[i++];
                }
                return newDigits;

            }
        }
        return digits;
    }
}