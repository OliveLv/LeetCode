#include<string>
#include<iostream>
#include<map>
using namespace std;
class Solution {
public:
    int romanToInt(string s) {
		int n=s.size();
		if(n==0)return 0;
		// 68ms
		//map<char,int>m;
		//m['I']=1;
		//m['X']=10;
		//m['C']=100;
		//m['M']=1000;
		//m['V']=5;
		//m['L']=50;
		//m['D']=500;

		// 32ms
		int m[26]={0};
		m['I'-'A']=1;
		m['X'-'A']=10;
		m['C'-'A']=100;
		m['M'-'A']=1000;
		m['V'-'A']=5;
		m['L'-'A']=50;
		m['D'-'A']=500;
		int ans=0;
		for(int i=0;i<n-1;i++){
			int a=m[s[i]-'A'];
			if(s[i]=='I'||s[i]=='X'||s[i]=='C'){
			int b=m[s[i+1]-'A'];
			if(a<b)ans-=a;
			else
				ans+=a;
			}
			else
				ans+=a;
		}
		ans+=m[s[n-1]-'A'];
		return ans;
    }
};