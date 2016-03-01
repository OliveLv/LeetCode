#include<vector>
using namespace std;
//sum
class Solution {
public:
    // 36ms
    int missingNumber(vector<int>& nums) {
       int n=nums.size();
       if(n==0)return 0;
       int s=n&1?((n+1)>>1)*n:(n>>1)*(n+1);
       for(int i=0;i<n;i++)
        s-=nums[i];
        return s;
    }
};

// xor
//class Solution {
//public:
//    // 32ms
//    int missingNumber(vector<int>& nums) {
//       int n=nums.size();
//       if(n==0)return 0;
//       if(n==1)return 1-nums[0];
//       int s=0;
//       for(int i=1;i<=n;i++)
//        s^=i^nums[i-1];
//        return s;
//    }
//
//};
// binary search
//class Solution {
//public:
//    // 68ms
//    int missingNumber(vector<int>& nums) {
//        int n=nums.size();
//        if(n==0)return 0;
//        sort(nums.begin(),nums.end());
//        int l=0,r=n;
//        int mid;
//        while(l<=r){
//            mid=l+((r-l)>>1);
//            if(nums[mid-1]+1!=nums[mid])return nums[mid-1]+1;
//            if(nums[mid]!=mid)r=mid-1;
//            else
//                l=mid+1;
//        }
//        return mid;
//    }
//};

