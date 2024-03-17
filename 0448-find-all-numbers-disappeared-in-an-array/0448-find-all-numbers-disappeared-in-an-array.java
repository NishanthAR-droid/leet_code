class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
//         extra space used but O(n) time complexity
//         int n=nums.length;
//         int counter[]=new int[n+1];
        
//         for(int i=0;i<n;i++)
//         {
//             counter[nums[i]]++;
//         }
        
//         List<Integer> ans=new ArrayList<>();
        
//         for(int i=1;i<=counter.length;i++)
//         {
//             if(counter[i]==0)
//                 ans.add(i);
//         }
//         return ans;
        
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int j=nums[i]-1;
            if(nums[i]==nums[j])
                i++;
            else
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;              
            }
        }
        
        List<Integer> ans=new ArrayList<>();
        
        for(int x=0;x<n;x++)
        {
            if(nums[x]!=x+1)
                ans.add(x+1);
        }
        return ans;        
        
    }
}