//Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
#include<windows.h>
#include<vector>
using namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
	// 20ms
    TreeNode* sortedArrayToBST(vector<int>& nums) {
        int n=nums.size();
		if(n==0)return NULL;
		// consider n==1 and n==2, it will get 16ms
		if(n==1){
			return new TreeNode(nums[0]);
		}
		if(n==2){
			TreeNode*root=new TreeNode(nums[0]);
			root->right=new TreeNode(nums[1]);
			return root;
		}
		TreeNode* root=dfs(nums,0,n-1);
		return root;
    }
	TreeNode * dfs(vector<int>&nums,int l,int r){
		if(l>r)return NULL;
		int mid=(l+r)/2;
		TreeNode* root=new TreeNode(nums[mid]);
		if(l==r)return root;
		root->left=dfs(nums,l,mid-1);
		root->right=dfs(nums,mid+1,r);
	}
};