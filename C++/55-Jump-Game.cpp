/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
*/
// 24ms
class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();
        if(n<=1)return true;
        int cur=0;
        while(true){
            int max=-1;
            int maxi=-1;
            //cout<<cur<<endl;
            if(nums[cur]==0)return false;
            for(int i=1;i<=nums[cur];i++){
                if(cur+i>=n-1)return true;
                if(max<cur+i+nums[cur+i]){
                    max=cur+i+nums[cur+i];
                    maxi=cur+i;
                }
            }
            cur=maxi;
        }
        return false;
    }
};

// 16ms
class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();
        if(n<=1||nums[0]>=(n-1))return true;
        int cur=0;
        while(true){
            int max=-1;
            int maxi=-1;
            //cout<<cur<<endl;
            if(nums[cur]==0)return false;
            for(int i=1;i<=nums[cur];i++){
                if(cur+i>=n-1)return true;
                if(max<i+nums[cur+i]){
                    max=i+nums[cur+i];
                    maxi=i;
                }
            }
            cur+=maxi;
        }
        return false;
    }
};