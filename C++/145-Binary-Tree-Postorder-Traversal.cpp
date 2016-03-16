class Solution {
public:
	// recursive
    vector<int> postorderTraversal(TreeNode* root) {
         vector<int>res;
         postorder(root,res);
         return res;
    }
    void postorder(TreeNode* root,vector<int>&res){
        if(root==NULL)return ;
        if(root->left!=NULL)postorder(root->left,res);
        if(root->right!=NULL)postorder(root->right,res);
        res.push_back(root->val);
    }
};

// iterator
// reference:http://zhidao.baidu.com/link?url=hi29Y_FNWekIU9L4YJV0hqzuzB6YXtQdH-7BJvfUUvzB731gxdH1_zMKfAZkBUo4JlhupBobBuq_usGqy-nrm_J9Fc79KE6i0WJ7tvb6sk3
class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) {
         vector<int>res;
         if(root==NULL)return res;
         stack<TreeNode*>s;
         TreeNode*p=root;
         while(p){
            s.push(p);
            p=p->left;
			}
         while(!s.empty()){
             p=s.top();
             //cout<<p->val<<endl;
             if(p->right){
                 //cout<<p->right->val<<endl;
                 s.push(p->right);
                 TreeNode*q=p->right;
                 p->right=NULL;
                 p=q;
                 while(p->left){
					//cout<<p->left->val<<"  fei"<<endl;
					s.push(p->left);
					p=p->left;
				}
             }else{
                 s.pop();
                 res.push_back(p->val);
				}
             }
         return res;
    }

};

// another iterator
class Solution {
public:
    vector<int> postorderTraversal(TreeNode* root) {
         vector<int>res;
         if(root==NULL)return res;
         stack<TreeNode*>s;
         s.push(root);
         while(!s.empty()){
             TreeNode*p=s.top();
             s.pop();
             res.push_back(p->val);
             if(p->left)s.push(p->left);
             if(p->right)s.push(p->right);
         }
         std::reverse(res.begin(),res.end());
         return res;
    }

};