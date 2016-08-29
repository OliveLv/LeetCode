/**
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
**/
public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        // f[i]表示s[0:i]是否能被dict分段
        int n=s.length();
        boolean []f=new boolean[n+1];
        f[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(f[j]&&wordDict.contains(s.substring(j,i))){
                    f[i]=true;
                    break;
                }
            }
            
        }
        return f[n];
    }
}