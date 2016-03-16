class Solution {
public:
	// 12 ms vector<int>tmp(n,0); save times 
	// it costs 16ms if not knowing the size of tmp and using  push_back(),erase 
    vector<vector<int>> permute(vector<int>& nums) {
        int n=nums.size();
        vector<vector<int>>res;
        if(n==0)return res;
        int*flag=new int[n];
        for(int i=0;i<n;i++)flag[i]=0;
        vector<int>tmp(n,0);
        dfs(res,nums,flag,tmp,0);
        return res;
        
    }
    void dfs(vector<vector<int>>&res,vector<int>&nums,int *flag,vector<int>&tmp,int j){
        int n=nums.size();
        if(j==n){
            res.push_back(tmp);
            return ;
        }
        for(int i=0;i<n;i++){
            if(!flag[i]){
                tmp[j]=nums[i];
                flag[i]=1;
                dfs(res,nums,flag,tmp,j+1);
                flag[i]=0;
            }
        }
    }
};