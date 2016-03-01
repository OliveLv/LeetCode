#include<vector>
#include<windows.h>
#include<stack>
using namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};
 
class Solution {
public:
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int>res;
        stack<TreeNode>s;
        if(root==NULL)return res;
        s.push(*(root));
        while(!s.empty()){
            TreeNode tmp=s.top();
            s.pop();
            res.push_back(tmp.val);
            if(tmp.right!=NULL)s.push(*(tmp.right));
            if(tmp.left!=NULL)s.push(*(tmp.left));
        }
        return res;
    }
};

//class Solution {
//public:
//    vector<int> preorderTraversal(TreeNode* root) {
//        vector<int>res;
//        stack<TreeNode*>s;
//        if(root==NULL)return res;
//        s.push(root);
//        while(!s.empty()){
//            TreeNode* tmp=s.top();
//            s.pop();
//            res.push_back(tmp->val);
//            if(tmp->right!=NULL)s.push(tmp->right);
//            if(tmp->left!=NULL)s.push(tmp->left);
//        }
//        return res;
//    }
//
//};
