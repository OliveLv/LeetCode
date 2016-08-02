/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

For example:
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
*/
// the same to 55-Jump-Game
class Solution {
public:
    int jump(vector<int>& nums) {
        int n=nums.size();
        if(n<=1)return 0;
        if(nums[0]>=(n-1))return 1;
        int cur=0;
        int res=0;
        while(true){
            int max=-1;
            int maxi=-1;
            //cout<<cur<<endl;
            if(nums[cur]==0)return false;
            for(int i=1;i<=nums[cur];i++){
                if(cur+i>=n-1)return res+1;
                if(max<i+nums[cur+i]){
                    max=i+nums[cur+i];
                    maxi=i;
                }
            }
            cur+=maxi;
            res++;
        }
        return res;
    }
};