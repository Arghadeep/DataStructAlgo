class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        min_val_sum = 0
        curr_sum = 0
        
        for num in nums:
            curr_sum += num
            min_val_sum = min(min_val_sum, curr_sum)
        return 1 if min_val_sum >= 0 else -(min_val_sum) + 1