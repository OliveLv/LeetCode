package lvxuhong.easy;
/**
 * Given a binary tree, determine if it is height-balanced. 

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1. 

 * @author xuhong
 *
 */
public class BalancedBinaryTree {
	boolean flag=true;
public boolean isBalanced(TreeNode root) {
	  deepth(root);
       return flag;
    }
public int deepth(TreeNode root){
	if(root==null)return 0;
	int l=0,r=0;
	if(root.left!=null){
		l=deepth(root.left);
	}
	if(root.right!=null){
		r=deepth(root.right);
	}
	if(Math.abs(l-r)>1)flag=false;
	int h=l<r?r:l;
	return h+1;
}
}
