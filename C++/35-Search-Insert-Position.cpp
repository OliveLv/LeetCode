#include<vector>
#include<iostream>
using namespace std;
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
		int n=nums.size();
		if(n==0)return 1;
		int l=0,r=n-1;
		while(l<=r){
			int mid=(l+r)/2;
			if(target==nums[mid])return mid;
			else
				if(target>nums[mid])l=mid+1;
				else
					r=mid-1;
		}
		return l;
    }
};