//Given an integer, write a function to determine if it is a power of three.
//
//Follow up:
//Could you do it without using any loop / recursion?
#include<cmath>
#include<iostream>
#include<stdio.h>
using namespace std;
// loop
//class Solution {
//public:
//    bool isPowerOfThree(int n) {
//		if(n==0)return false;
//        double tmp=(log(n)/log(3));
//		float tf=tmp*10;
//		int ti=tf/10;
//		if(pow(3,ti)==n)return true;
//		return false;
//    }
//};
// math
//class Solution {
//public:
//    bool isPowerOfThree(int n) {
//		if(n==0)return false;
//		while(n!=1){
//			if(n%3)return false;
//			n/=3;
//		}
//		return true;
//    }
//};
class Solution {
public:
    bool isPowerOfThree(int n) {
		if(n==0)return false;
		return fmod(log10(n)/log10(3),1)==0;
    }
};
int main(){
	Solution test=Solution();
	int n;
	while(1){
		cin>>n;
		cout<<test.isPowerOfThree(n)<<endl;
	}
	return 0;
}