package olivelv.medium;

/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Assume a BST is defined as follows: 
 * •The left subtree of a node contains only nodes with keys less than the node's key. 
 * •The right subtree of a node contains only nodes with keys greater than the node's key. 
 * •Both the left and right subtrees must also be binary search trees.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月28日 下午7:49:04
 */
public class ValidateBinarySearchTree {
	boolean flag=true;
	public boolean isValidBST(TreeNode root) {
		flag=true;
		dfs(root);
		return flag;
	}
	// another approach is putting max and min into parameters of function 
	public int []dfs(TreeNode root){
		int []list=new int[2];
		if(root==null||!flag){
			list[0]=Integer.MIN_VALUE;
			list[1]=Integer.MAX_VALUE;
			return list;
		}
		int max=root.val;
		int min=root.val;
		if(root.left!=null){
			list=dfs(root.left);
			if(list[0]>=root.val){
				flag=false;
			}
			if(max<list[0])max=list[0];
			if(min>list[1])min=list[1];
		}
		if(root.right!=null){
			list=dfs(root.right);
			if(list[1]<=root.val)flag=false;
			if(max<list[0])max=list[0];
			if(min>list[1])min=list[1];
		}
		if(max<root.val)max=root.val;
		if(min>root.val)min=root.val;
		list[0]=max;
		list[1]=min;
		return list;
	}
}
