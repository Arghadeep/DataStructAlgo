class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        n = len(nums)

        def swap(i, j):
            nums[i], nums[j] = nums[j], nums[i]

        def quickselect(l, r):
            pivot_i = random.randrange(l, r + 1)
            pivot = nums[pivot_i]
            swap(pivot_i, r)

            store_i = l
            for i in range(l, r):
                if nums[i] < pivot:
                    swap(i, store_i)
                    store_i += 1

            swap(store_i, r)
            return store_i

        l = 0
        r = n - 1

        while True:
            p = quickselect(l, r)

            if n - k == p:
                return nums[p]
            elif n - k > p:
                l = p + 1
            else:
                r = p - 1