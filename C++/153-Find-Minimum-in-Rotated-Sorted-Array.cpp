class Solution {
public:
	// 6ms
    int findMin(vector<int>& nums) {
        int n=nums.size();
        if(n==1)return nums[0];
        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i])return nums[i];
        }
        return nums[0];
    }
};

class Solution {
public:
	// 4ms
    int findMin(vector<int>& nums) {
        int n=nums.size();
        if(n==1)return nums[0];
        int l=0,r=n-1;
        while(l<r){
            int mid=(l+r)>>1;
            if(nums[mid]>nums[r])l=mid+1;
            else
            r=mid;
        }
        return nums[l];
    }
};