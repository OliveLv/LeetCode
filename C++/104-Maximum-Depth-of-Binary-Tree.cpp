#include<iostream>
using namespace std;
 //Definition for a binary tree node.
 struct TreeNode {
     int val;
     TreeNode *left;
     TreeNode *right;
     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 };
 
class Solution {
public:
    int maxDepth(TreeNode* root) {
       if(root==NULL)return 0;
	   int l=0,r=0;
	   if(root->left!=NULL)l=maxDepth(root->left);
	   if(root->right!=NULL)r=maxDepth(root->right);
       return 1+(l>r?l:r);
    }
};
