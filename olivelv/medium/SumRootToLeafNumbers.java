package olivelv.medium;

import olivelv.easy.BinaryTreeLevelOrderTraversal;

/**
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path
 * could represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * For example, 1 / \ 2 3
 * 
 * 
 * 
 * The root-to-leaf path 1->2 represents the number 12. The root-to-leaf path
 * 1->3 represents the number 13.
 * 
 * Return the sum = 12 + 13 = 25.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月7日 下午8:48:40
 */
public class SumRootToLeafNumbers {
	int s=0;
	public int sumNumbers(TreeNode root) {
		s=0;
		dfs(root,0);
         return s;
	}
	public void dfs(TreeNode root,int val){
		if(root==null)return ;
		val=val*10+root.val;
		//System.out.println(val);
		if(root.left!=null)dfs(root.left,val);
		if(root.right!=null)dfs(root.right,val);
		if(root.left==null&&root.right==null)s+=val;
	}
	public static void main(String []args){
		 TreeNode root=new TreeNode(1);
		 root.right=new TreeNode(2);
		// TreeNode p=root.right;
		 root.left=new TreeNode(3);
		 SumRootToLeafNumbers test=new SumRootToLeafNumbers();
		// test.preorderTraversal(root);
		 System.out.println(test.sumNumbers(root));
	}
}
