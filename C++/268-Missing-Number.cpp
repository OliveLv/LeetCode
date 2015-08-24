/**
**author : olivelv 
**
**/
#include<iostream>
#include<algorithm>
#include<string>
#include<map>
#include<vector>
using namespace std;
class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int s=n%2==0?n/2*(n+1):(n+1)/2*n;
        for(int i=0;i<n;i++){
        	s-=nums[i];
        }
        return s;
    }
};
int main(){
	Solution test=Solution();
	vector<int> v;
	v.push_back(0);
	v.push_back(1);
	v.push_back(3);
	cout<<test.missingNumber(v)<<endl;
	return 0;
}