#include<vector>
#include<iostream>
using namespace std;
// reference: http://www.codinghelmet.com/?path=exercises/two-numbers-appearing-once-in-array
class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
		int n=nums.size();
		int combine=0;
		for(int i=0;i<n;i++){
			combine^=nums[i];
		}
		int mask=1;
		while((mask&combine)==0)mask<<=1;
		int x=0,y=0;
		for(int i=0;i<n;i++){
			if(nums[i]&mask)x^=nums[i];
			else
				y^=nums[i];
		}
		vector<int>res=vector<int>();
		res.push_back(x);
		res.push_back(y);
		return res;
    }
};