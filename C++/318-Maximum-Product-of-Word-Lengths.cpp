//Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.
//
//Example 1:
//Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
//Return 16
//The two words can be "abcw", "xtfn".
//
//Example 2:
//Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
//Return 4
//The two words can be "ab", "cd".
//
//Example 3:
//Given ["a", "aa", "aaa", "aaaa"]
//Return 0
//No such pair of words.
#include<vector>
#include<string>
#include<iostream>
#include<algorithm>
using namespace std;
class Solution {
public:
    int maxProduct(vector<string>& words) {
		int n=words.size();
		if(n<2)return 0;
		// 'vector<int>res' costs 20ms more than using 'int*res=new int[n]'
		//vector<int>res=vector<int>(n,0);
		int*res=new int[n];
		for(int i=0;i<n;i++){
			//string word=words[i];
			//transform(word.begin(),word.end(),word.begin(),::tolower);
			res[i]=0;
			int l=words[i].size();
			for(int j=0;j<l;j++){
				res[i]|=1<<(words[i][j]-'a');
			}
			//res[i]=bit;
			//cout<<bit<<endl;
		}
		int max=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++)
				if(!(res[i]&res[j])){
					int tmp=words[i].length()*words[j].length();
					if(max<tmp)max=tmp;
				}
		}
		return max;
    }
};
//int main(){
//	vector<string>v;
//	int n;
//	cin>>n;
//	for(int i=0;i<n;i++){
//		string tmp;
//		cin>>tmp;
//		v.push_back(tmp);
//	}
//	Solution test=Solution();
//	cout<<test.maxProduct(v)<<endl;
//	system("pause");
//	return 0;
//}