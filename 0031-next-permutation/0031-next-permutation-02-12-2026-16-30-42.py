class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p=len(nums)-2
        while p>=0:
            if nums[p]<nums[p+1]:
                break
            p-=1

        if p>=0:
            for i in range(len(nums)-1,p,-1):
                if nums[i]>nums[p]:
                    nums[p], nums[i] = nums[i], nums[p]
                    break

        nums[p+1:]= reversed(nums[p+1:])        

        