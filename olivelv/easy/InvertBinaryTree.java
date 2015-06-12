package olivelv.easy;

import java.util.Stack;

/**
 * https://leetcode.com/problems/invert-binary-tree/ InvertBinaryTree.java
 * 
 * @author olivelv
 * @version time: Jun 12, 2015 6:26:44 PM
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		Stack<TreeNode>stack=new Stack<TreeNode>();
		if(root==null)return root;
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode p=stack.pop();
			TreeNode tmp=p.left;
			p.left=p.right;
			p.right=tmp;
			if(p.left!=null)stack.push(p.left);
			if(p.right!=null)stack.push(p.right);
			
		}
		return root;
	}
}
