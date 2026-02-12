class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        i = 0
        j = len(prices)-1
        n = 0
        for n in range(len(prices)):
            if i+1<len(prices) and prices[i+1]<prices[i]:
                i+=1
            if j-1>=0 and prices[j-1]>prices[j]:
                j-=1    

           
        return 0 if i>=j else prices[j]-prices[i]            