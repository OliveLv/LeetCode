//Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
//
//For example:
//
//Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
#include<vector>
#include<iostream>
using namespace std;
class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
		int n=nums.size();
		if(n==2)return nums;
		//vector<int>res=vector<int>(2,0);
		int a=0,b=0;
		int tmp=0;
		for(int i=0;i<n;i++){
			tmp^=nums[i];
		}
		// 20ms
		//tmp&=(~(tmp-1));
		tmp=tmp^(tmp&(tmp-1));
		// 18ms
		// tmp=tmp&(tmp-1)^tmp;
		for(int i=0;i<n;i++){
			if(nums[i]&tmp)a^=nums[i];
			else
				b^=nums[i];
		}
		return vector<int>{a,b};
    }
};