//Given two strings s and t, write a function to determine if t is an anagram of s.
//
//For example,
//s = "anagram", t = "nagaram", return true.
//s = "rat", t = "car", return false.
//
//Note:
//You may assume the string contains only lowercase alphabets.
#include<string>
#include<map>
using namespace std;
//class Solution {
//public:
//	// 12ms
//    bool isAnagram(string s, string t) {
//		int n=s.length();
//		if(n!=t.length())return false;
//		if(n==0)return true;
//		int a[26]={0};
//		for(int i=0;i<n;i++){
//			a[s[i]-'a']++;
//		}
//		for(int i=0;i<n;i++)
//			if(a[t[i]-'a']==0)return false;
//			else
//				a[t[i]-'a']--;
//		return true;
//    }
//};
class Solution {
public:
	// 12ms
    bool isAnagram(string s, string t) {
		int n=s.length();
		if(n!=t.length())return false;
		if(n==0)return true;
		int a[26]={0};
		for(int i=0;i<n;i++){
			a[s[i]-'a']++;
			a[t[i]-'a']--;
		}
		for(int i=0;i<26;i++)
			if(a[i]!=0)return false;
		return true;
    }
};