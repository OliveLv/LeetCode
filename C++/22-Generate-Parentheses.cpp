class Solution {
public:
    vector<string> generateParenthesis(int n) {
        vector<string>res;
        if(n==0)return res;
        dfs(res,n,0,0,"");
        return res;
    }
    void dfs(vector<string>&res,int n,int l,int r,string s){
        if(l==n&&r==n){
            res.push_back(s);
            return ;
        }
        if(l==n){
            dfs(res,n,l,r+1,s+")");
            return ;
        }
        if(l==r){
            dfs(res,n,l+1,r,s+"(");
            return ;
        }
        dfs(res,n,l+1,r,s+"(");
        dfs(res,n,l,r+1,s+")");
        
    }
};