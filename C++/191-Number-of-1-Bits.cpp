//Write a function that takes an unsigned integer and returns the number of ¡¯1' bits it has (also known as the Hamming weight).
//
//For example, the 32-bit integer ¡¯11' has binary representation 00000000000000000000000000001011, so the function should return 3.
#include<stdint.h>
#include<bitset>
using namespace std;
class Solution {
public:
	// 8ms
  //  int hammingWeight(uint32_t n) {
		//bitset<32>ans(n);
		//return ans.count();
  //  }
	// 8ms
	int hammingWeight(uint32_t n) {
		int cnt=0;
		for(;n;n>>=1){
			if(n&1)cnt++;
		}
		return cnt;
    }
	// 4ms
    int hammingWeight(uint32_t n) {
        int cnt = 0;
        for(; n; n >>= 1)
            if(n&1) ++cnt;
        return cnt;
    }
};