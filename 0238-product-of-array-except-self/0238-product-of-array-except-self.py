class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        answer = [1]*len(nums)
        prefix = [1]*len(nums)
        suffix = [1]*len(nums)
        running_prod=1
        for i in range len(nums):
            prefix[i] =  running

        