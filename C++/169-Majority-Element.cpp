#include<vector>
using namespace std;
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n=nums.size();
        if(n==1)return nums[0];
        int pre=nums[0];
        int cnt=1;
        for(int i=0;i<n;i++){
            if(nums[i]==pre)cnt++;
            else
                cnt--;
            if(cnt==0){
                pre=nums[i];
                cnt=1;
            }
        }
        return pre;
    }

};
