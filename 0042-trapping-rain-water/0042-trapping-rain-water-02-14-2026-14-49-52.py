class Solution:
    def trap(self, height: List[int]) -> int:
        """
        Calculates trapped water using a two-pointer inward scan.
        
        Logic:
        1. Initialize l, r pointers at the ends and track left_max, right_max.
        2. Move the pointer with the lower 'ceiling' (left_max vs right_max).
        3. Since the other side is guaranteed to have a taller wall, the 
           current side's max is the only bottleneck for the current index.
        4. Accumulate water on the fly and move inward until pointers meet.
        
        Time Complexity: O(n) - Single pass through the array.
        Space Complexity: O(1) - Constant space using only variables.
        """
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

