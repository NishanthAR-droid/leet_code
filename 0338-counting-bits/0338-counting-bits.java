class Solution {
    public int[] countBits(int n) {
        //brute force time complexity:O(n log n)
//         int []ans=new int[n+1];
    
//         for(int i=0;i<=n;i++)     //for loop is O(n)
//         {
//             ans[i]=0;
//             int x=i;
//             while(x!=0)           //while loop is O(log n)
//             {
//                 if(x%2==1)
//                     ans[i]++;
//                 x=x/2;
//             }
//         }
//         return ans;
        
        //optimized code
        
        int ans[]=new int[n+1];
        ans[0]=0;
        if(n==0)
            return ans;
        
        for(int i=1;i<=n;i++)
        {
            ans[i]=ans[i>>1]+(i&1);  //can also be ans[i/2] as >>1 is same as /2
        }
        
        return ans;
    }
}