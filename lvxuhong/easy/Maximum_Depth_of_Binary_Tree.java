/**
 * problem:
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 * @author LXH
 *
 */
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Maximum_Depth_of_Binary_Tree {
	public int maxDepth(TreeNode root) {
        return dfs(root);
	}
	public int max(int a,int b){
		return a>b?a:b;
	}
	public int dfs(TreeNode root){
		int dl=0,dr=0;
		if(root==null)return 0;
		if(root.left!=null)dl=dfs(root.left)+1;
		if(root.right!=null)dr=dfs(root.right)+1;
		//if(root.left==null && root.right==null)return 1;
		return max(1,max(dl,dr));
			
	}
}
