//Given an array of integers, every element appears three times except for one. Find that single one.
#include<vector>
#include<iostream>
#include<map>
using namespace std;
//class Solution {
//public:
//	// 52ms
//    int singleNumber(vector<int>& nums) {
//		map<int,int>m;
//		int n=nums.size();
//		for(int i=0;i<n;i++){
//			int tmp=0;
//			if(m.find(nums[i])!=m.end())tmp=m[nums[i]];
//			m[nums[i]]=tmp+1;
//		}
//		for(int i=0;i<n;i++)
//			if(m[nums[i]]!=3)return nums[i];
//		return -1;
//    }
//};
//class Solution {
//public:
//	// 16ms
//    int singleNumber(vector<int>& nums) {
//		vector<int>bit(32);
//		int n=nums.size();
//		for(int i=0;i<n;i++){
//			int tmp=nums[i];
//			for(int j=0;j<32;j++){
//				bit[j]+=tmp&1;
//				tmp>>=1;
//				if(!tmp)break;
//			}
//		}
//		int ans=0;
//		for(int i=31;i>=0;i--){
//			bit[i]%=3;
//			ans<<=1;
//			if(bit[i])ans|=1;
//		}
//		return ans;
//    }
//};
class Solution {
public:
	// 12ms
    int singleNumber(vector<int>& nums) {
		int n=nums.size();
		if(n<=2)return nums[0];
		int one=0;
		int two=0;
		for(int i=0;i<n;i++){
			one=(~two)&(one^nums[i]);
			two=(~one)&(two^nums[i]);
		}
		return one;
    }
};