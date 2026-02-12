class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        prof = 0
        minprice = prices[0]
        for i in prices:
            if i < minprice:
                minprice=i

            if i - minprice > prof:
                prof = i - minprice

        return prof    
