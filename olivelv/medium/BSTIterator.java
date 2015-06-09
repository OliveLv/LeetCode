package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement an iterator over a binary search tree (BST). Your iterator will be
 * initialized with the root node of a BST.
 * 
 * Calling next() will return the next smallest number in the BST.
 * 
 * Note: next() and hasNext() should run in average O(1) time and uses O(h)
 * memory, where h is the height of the tree.
 * 
 * BinarySearchTreeIterator.java
 * 
 * @author olivelv
 * @version time: Jun 9, 2015 7:37:44 PM
 */
public class BSTIterator {
	private List<Integer>list;
	private void dfs(TreeNode root){
		if(root==null)return ;
		if(root.left!=null)dfs(root.left);
		list.add(root.val);
		if(root.right!=null)dfs(root.right);
	}
	public BSTIterator(TreeNode root) {
		list=new ArrayList<Integer>();
		dfs(root);
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		if(list.isEmpty())return false;
		return true;
	}

	/** @return the next smallest number */
	public int next() {
		int val=list.get(0);
		list.remove(0);
		return val;
	}
}
