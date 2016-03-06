//Given a binary tree
//
//    struct TreeLinkNode {
//      TreeLinkNode *left;
//      TreeLinkNode *right;
//      TreeLinkNode *next;
//    }
//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//
//Initially, all next pointers are set to NULL.
//
//Note:
//
//You may only use constant extra space.
//You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
//For example,
//Given the following perfect binary tree,
//         1
//       /  \
//      2    3
//     / \  / \
//    4  5  6  7
//After calling your function, the tree should look like:
//         1 -> NULL
//       /  \
//      2 -> 3 -> NULL
//     / \  / \
//    4->5->6->7 -> NULL
#include<windows.h>
#include<vector>
#include<queue>
using namespace std;
struct TreeLinkNode {
    int val;
    TreeLinkNode *left,*right,*next;

    TreeLinkNode(int x) : val(x), left(NULL), right(NULL), next(NULL) {}
};
//class Solution {
//public:
//	// 28ms
//    void connect(TreeLinkNode *root) {
//       queue<TreeLinkNode*>q;
//	   if(root==NULL)return ;
//	   q.push(root);
//	   int k=0;
//	   while(!q.empty()){
//		   TreeLinkNode*p=q.front();
//		   q.pop();
//		   k++;
//		   if(((k+1)&k)!=0&&!q.empty())p->next=q.front();
//		   if(p->left!=NULL)q.push(p->left);
//		   if(p->right!=NULL)q.push(p->right);
//	   }
//    }
//};
class Solution {
public:
	// 24ms
    void connect(TreeLinkNode *root) {
       vector<TreeLinkNode*>q;
	   if(root==NULL)return ;
	   q.push_back(root);
	   int k=0;
	   while(k<q.size()){
		   TreeLinkNode*p=q[k++];
		   if(((k+1)&k)!=0&&!q.empty())p->next=q[k];
		   if(p->left!=NULL)q.push_back(p->left);
		   if(p->right!=NULL)q.push_back(p->right);
	   }
    }
};