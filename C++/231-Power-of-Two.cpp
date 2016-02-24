//Given an integer, write a function to determine if it is a power of two.
#include<iostream>
#include<bitset>
using namespace std;
// costs 8ms
//class Solution {
//public:
//    bool isPowerOfTwo(int n) {
//        return (n>0)&&((n&(n-1))==0);
//    }
//};
// costs 4ms
class Solution {
public:
    bool isPowerOfTwo(int n) {
        return (n>0)&&(bitset<sizeof(n)*8>(n).count()==1);
    }
};
int main(){
	Solution test=Solution();
	int n;
	while(1){
		cin>>n;
		cout<<test.isPowerOfTwo(n)<<endl;
	}
	return 0;
}