class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        checker = False
        seen = {}
        n = len(nums)
        for i in range(n):
            if nums[i] in seen:
                checker = True
                break
            else:
                seen[nums[i]] = 1
        return checker
            
        