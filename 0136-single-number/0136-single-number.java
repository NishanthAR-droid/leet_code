class Solution {
    public static int singleNumber(int[] nums) {
        int sum=0;
        for(int x:nums)
           sum^=x;
        return sum;
    }
    
}