class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        mp = {}

        for i,x in enumerate(nums):
            to_find = target - x
            if to_find in mp:
                return [mp[to_find],i]
            mp[x] = i    

