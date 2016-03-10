class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size();
        if(n==0)return 0;
        int max=0x80000000;
        int s=0;
        for(int i=0;i<n;i++){
            if(s+nums[i]<nums[i])s=nums[i];
            else
            s+=nums[i];
            if(s>max)max=s;
        }
        return max;
    }
};