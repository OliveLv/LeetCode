#include<iostream>
using namespace std;

//  Definition for a binary tree node.
  struct TreeNode {
      int val;
      TreeNode *left;
      TreeNode *right;
      TreeNode(int x) : val(x), left(NULL), right(NULL) {}
  };
 
class Solution {
public:
    bool isSameTree(TreeNode* p, TreeNode* q) {
    	if(p==NULL||q==NULL){
    		if(p==NULL&&q==NULL)return true;
    		return false;
    	}
    	if(p->val!=q->val)return false;
    	bool l=true,r=true;
    	l=isSameTree(p->left,q->left);
    	r=isSameTree(p->right,q->right);
    	if(l&&r)return true;
    	return false;
    }
};
int int main()
{
	/* code */
	return 0;
}