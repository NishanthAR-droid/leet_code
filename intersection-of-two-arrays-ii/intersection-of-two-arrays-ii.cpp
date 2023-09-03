class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        
        // vector<int> ans;
        // sort(nums1.begin(),nums1.end());
        // sort(nums2.begin(),nums2.end());
        // int i=0,j=0;
        // while(i<nums1.size() && j<nums2.size())
        // {
        //     if(nums1[i]==nums2[j])
        //     {
        //         ans.push_back(nums1[i]);
        //         i++;
        //         j++;
        //     }
        //     else if(nums1[i]<nums2[j])
        //         i++;
        //     else
        //         j++;
        // }
        // return ans;
        
        // Hashtable approach
        unordered_map<int, int> mp;
        vector<int> ans;
        for(auto x: nums1) mp[x]++;
        for(int i = 0; i < nums2.size(); i++){
            if(mp.find(nums2[i]) != mp.end() && --mp[nums2[i]] >= 0) 
                ans.push_back(nums2[i]);
        }
        return ans;
    }
};