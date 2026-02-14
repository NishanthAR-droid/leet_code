class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_total=nums[0]
        cur_total=0
        
        for i in nums:
            cur_total = max(i, cur_total+i)
            max_total = max(max_total,cur_total)          

        return max_total