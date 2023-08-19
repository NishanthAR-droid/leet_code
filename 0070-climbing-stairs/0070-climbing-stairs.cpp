class Solution {
public:
    int climbStairs(int n) {
        if(n<=3) return n;
        
        int first =1,second=1;
        
        int result=0;
        
        for(int i=0;i<n-1;i++)
        {
            result=first+second;
            second=first;
            first= result;
        }
        return result;
    }
};