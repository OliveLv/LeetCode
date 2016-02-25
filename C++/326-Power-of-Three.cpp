//Given an integer, write a function to determine if it is a power of three.
//
//Follow up:
//Could you do it without using any loop / recursion?
#include<cmath>
#include<iostream>
#include<stdio.h>
#include <fstream>
#include<set>
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
//class Solution {
//public:
//    bool isPowerOfThree(int n) {
//		if(n==0)return false;
//		return fmod(log10(n)/log10(3),1)==0;
//    }
//};
#define N 0x7fffffff
class Solution {
public:
    bool isPowerOfThree(int n) {
		int list[]={1, 3, 9, 27, 81, 243, 729, 2187, 6561, 19683, 59049, 177147, 531441, 1594323, 4782969, 14348907, 43046721, 129140163, 387420489, 1162261467};
		set<int>s(list,list+20);
		return s.find(n)!=s.end();
    }
};

//int main(){
//	Solution test=Solution();
//	int n;
//	while(1){
//		cin>>n;
//		cout<<test.isPowerOfThree(n)<<endl;
//	}
//	return 0;
//}