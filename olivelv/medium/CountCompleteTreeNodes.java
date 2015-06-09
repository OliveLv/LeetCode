package olivelv.medium;

/**
 * Given a complete binary tree, count the number of nodes.
 * 
 * Definition of a complete binary tree from Wikipedia: In a complete binary
 * tree every level, except possibly the last, is completely filled, and all
 * nodes in the last level are as far left as possible. It can have between 1
 * and 2h nodes inclusive at the last level h.
 * 
 * CountCompleteTreeNodes.java
 * 
 * @author olivelv
 * @version time: Jun 9, 2015 8:14:58 AM
 */
public class CountCompleteTreeNodes {
	public int countNodes(TreeNode root) {
		if(root==null)return 0;
		TreeNode left=root,right=root;
		int h=0;
		while(right!=null){
			left=left.left;
			right=right.right;
			h++;
		}
		if(left==null)// full binary tree
			return (1<<h)-1;
		return 1+countNodes(root.left)+countNodes(root.right);
	}
}
