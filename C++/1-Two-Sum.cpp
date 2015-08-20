#include<iostream>
#include<vector>
#include<map>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::vector<int> idx;
        std::map<int, int> map;
        int n=nums.size();
        for(int i=0;i<n;i++){
        	int val=target-nums[i];
        	if(map.find(val)!=map.end()){
        		idx.push_back(map[val]+1);
        		idx.push_back(i+1);
        		return idx;
        	}
        	map[nums[i]]=i;
        }
        return idx;

    }
};
int main(){
	Solution test=Solution();
	vector<int>nums;
	nums.push_back(2);
	nums.push_back(7);
	nums.push_back(11);
	nums.push_back(15);
	vector<int>idx=test.twoSum(nums,9);
	cout<<idx[0]<<","<<idx[1]<<endl;
	return 0;
}