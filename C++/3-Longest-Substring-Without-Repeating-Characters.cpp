#include<iostream>
#include<map>
#include<string>
using namespace std;
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        map<char,int>m;
        int max=0;
        int l=0,r=-1;
        int n=s.length();
        for(int i=0;i<n;i++){
        	if(m.find(s[i])!=m.end()&&m[s[i]]>=l){
        		if(max<r-l+1){
        			max=r-l+1;
        		}
        		l=m[s[i]]+1;
        	}
        	r++;
        	m[s[i]]=i;
        }
        if(max<r-l+1){
        	max=r-l+1;
        }
        return max;


    }
};
int main(){
	//string s;
	//cin>>s;
	string s="bbbbb";
	Solution test=Solution();
	cout<<test.lengthOfLongestSubstring(s)<<endl;
	return 0;
}