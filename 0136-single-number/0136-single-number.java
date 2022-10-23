class Solution {
    public static int singleNumber(int[] nums) {
        int sum=0;
        for(int x:nums)
           sum^=x;
        return sum;
    }
    
    public static void main(String[] args)
    {
        int[] nums={2,2,1};
        singleNumber(nums);
    }
}