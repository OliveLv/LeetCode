package lvxuhong.easy;
/**
 * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

 * @author xuhong
 *
 */
public class MinimumDepthOfBinaryTree {
	 public int minDepth(TreeNode root) {
	        return deepth(root);
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
			int h=l>r?r:l;
			return h+1;
		}
}
