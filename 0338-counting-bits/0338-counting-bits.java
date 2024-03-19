class Solution {
    public int[] countBits(int n) {
        //brute force time complexity:O(n log n)
        int []ans=new int[n+1];
    
        for(int i=0;i<=n;i++)
        {
            ans[i]=0;
            int x=i;
            while(x!=0)
            {
                if(x%2==1)
                    ans[i]++;
                x=x/2;
            }
        }
        return ans;
        
    }
}