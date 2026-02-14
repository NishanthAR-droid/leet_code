class Solution:
    def trap(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        leftmax=height[l]
        rightmax= height[r]
        water = 0

        while l<=r:
            if leftmax<rightmax:
                leftmax = max(leftmax,height[l])
                water+=leftmax-height[l]
                l+=1
            else:
                rightmax = max(rightmax,height[r])
                water+=rightmax-height[r]
                r-=1

        return water        

