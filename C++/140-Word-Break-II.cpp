/**
Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.

Return all such possible sentences.

For example, given
s = "catsanddog",
dict = ["cat", "cats", "and", "sand", "dog"].

A solution is ["cats and dog", "cat sand dog"].
**/

public class Solution {
    public void dfs(boolean [][]dp,int idx,String str,List<String>res,int n,String s){
        if(idx==0){
            res.add(new String(str));
            return ;
        }
        for(int i=0;i<idx;i++){
            if(dp[i][idx]){
                if(str.equals(""))dfs(dp,i,s.substring(i,idx),res,n,s);
                else
                dfs(dp,i,s.substring(i,idx)+" "+str,res,n,s);
            }
        }
    }
    public List<String> wordBreak(String s, Set<String> wordDict) {
        int n=s.length();
        boolean f[]=new boolean[n+1];
        boolean dp[][]=new boolean[n+1][n+1];
        f[0]=true;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(f[j]&& wordDict.contains(s.substring(j,i))){
                    f[i]=true;
                    dp[j][i]=true;
                }
            }
        }
        List<String>res=new ArrayList<String>();
        if(!f[n])return res;
        dfs(dp,n,"",res,n,s);
       /* for(String str:res){
            System.out.println(str);
        }*/
        return res;
    }
}