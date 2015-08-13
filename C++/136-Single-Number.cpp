#include<iostream>
#include<vector>
using namespace std;
class Solution {
public:
    int singleNumber(vector<int>& nums) {
        vector<int>::iterator it=nums.begin();
        int val=*it;
        for(it++;it!=nums.end();it++)
          val^=*it;
        return val;
    }
};
int main(){
vector<int>nums;
nums.push_back(1);
nums.push_back(2);
nums.push_back(3);
nums.push_back(2);
nums.push_back(1);
Solution test=Solution();
int val=test.singleNumber(nums);
cout<<val<<endl;
return 0;
}
