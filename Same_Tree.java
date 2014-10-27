/**
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and
 * the nodes have the same value.
 * 
 * @author LXH
 *
 */
// Definition for binary tree
/*
 * class TreeNode { int val; TreeNode left; TreeNode right;
 * 
 * TreeNode(int x) { val = x; } }
 */

public class Same_Tree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		return dfs(p, q);

	}
	boolean dfs(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p != null && q != null && p.val != q.val)
			return false;
		if (p != null && q != null) {
			boolean l=dfs(p.left,q.left);
			boolean r=dfs(p.right,q.right);
			return l&&r;
		}
		return false;

	}
}
