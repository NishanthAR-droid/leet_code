class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
       int i,j;
        
       for(i=1,j=0;i<nums.size();i++)
       {
           if(nums[i]==nums[j])
               continue;
           nums[++j]=nums[i];
       }            
       
        return ++j;    
    }
};