#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
		int n=nums.size();
		int k=0;
		for(int i=0;i<n;i++){
			if(nums[i]!=0)nums[k++]=nums[i];
		}
		for(;k<n;k++)nums[k]=0;
    }
};