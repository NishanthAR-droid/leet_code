class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        maxv=0
        while l<r:
            curv=(r-l)*min(height[l],height[r])
            maxv = max(maxv,curv)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1

        return maxv