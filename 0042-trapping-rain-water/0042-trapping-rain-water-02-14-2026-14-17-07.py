class Solution:
    def trap(self, height: List[int]) -> int:
        """
        Calculates trapped water using precomputed maximum height arrays.
        
        Logic:
        1. Build 'leftmax' array: At each index i, store the tallest wall to the left.
        2. Build 'rightmax' array: At each index i, store the tallest wall to the right.
        3. For each bar, water = min(leftmax[i], rightmax[i]) - current_height.
        
        Time Complexity: O(n) - Three linear passes through the array.
        Space Complexity: O(n) - Two extra arrays of size n.
        """
        n = len(height)
        leftmax = [0]*n
        rightmax = [0]*n
        water = 0

        for i in range(1,n):
            leftmax[i] = max(leftmax[i-1], height[i-1])

        for i in range(n-2,0,-1):
            rightmax[i] = max(rightmax[i+1], height[i+1])

        for i in range(1,n-1):
            if min(leftmax[i],rightmax[i])>height[i]:
                water += min(leftmax[i],rightmax[i])-height[i]

        return water        

