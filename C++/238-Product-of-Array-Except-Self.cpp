//Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//Solve it without division and in O(n).
//
//For example, given [1,2,3,4], return [24,12,8,6].
#include<vector>
#include<iostream>
using namespace std;
class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
		int n=nums.size();
		vector<int>a=vector<int>(n,0);
		if(n==2){
			a[0]=nums[1];
			a[1]=nums[0];
			return a;
		}
		int cnt=0;
		int s=1;
		a[0]=1;
		for(int i=1;i<n;i++){
			if(nums[i-1]==0)cnt++;
			else
				s*=nums[i-1];
			a[i]=a[i-1]*nums[i-1];
		}
		if(nums[n-1]==0)cnt++;
		else
			s*=nums[n-1];
		if(cnt>1)return vector<int>(n,0);
		if(cnt==1){
			for(int i=0;i<n;i++)
				if(nums[i]==0)a[i]=s;
				else
					a[i]=0;
			for(int i=0;i<n;i++)cout<<a[i]<<" ";
			return a;
		}
		for(int i=n-1;i>0;i--){
			a[i-1]=a[i-1]*nums[i];
			nums[i-1]=nums[i]*nums[i-1];
		}
		//for(int i=0;i<n;i++)cout<<a[i]<<" ";
		return a;
    }
};
//int main(){
//	vector<int>nums;
//	for(int i=1;i<5;i++){
//		nums.push_back(i);
//	}
//	Solution test=Solution();
//	test.productExceptSelf(nums);
//	system("pause");
//	return 0;
//}