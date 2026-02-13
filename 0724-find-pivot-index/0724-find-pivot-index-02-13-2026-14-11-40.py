class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        ls=0
        total=sum(nums)

        for i,x in enumerate(nums):
            if ls== total-ls-x:
                return i
            ls+=x

        return -1
        