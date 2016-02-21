//Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.
//
//Note:
//You must not modify the array (assume the array is read only).
//You must use only constant, O(1) extra space.
//Your runtime complexity should be less than O(n2).
//There is only one duplicate number in the array, but it could be repeated more than once.
#include<vector>
#include<iostream>
#include<set>
using namespace std;
//class Solution {
//public:
//    int findDuplicate(vector<int>& nums) {
//		int n=nums.size();
//		set<int>s;
//		for(int i=0;i<n;i++)
//			if(s.find(nums[i])!=s.end())return nums[i];
//			else
//				s.insert(nums[i]);
//		
//    }
//};
class Solution {
public:
    int findDuplicate(vector<int>& nums) {
		int n=nums.size();
		int dup=nums[0];
		for(int i=1;i<n;i++)
			dup=!(dup^nums[i]);
		return dup;
    }
};