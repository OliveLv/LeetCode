package olivelv.medium;

/**
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note: You may assume that duplicates do not exist in the tree.
 * 
 * @author olive
 *
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int l=postorder.length;
		if(l==0)return null;
		TreeNode root=new TreeNode(postorder[l-1]);
		int i;
		for(i=0;i<l;i++)
			if(inorder[i]==postorder[l-1])break;
		System.out.println(root.val);
	    root.left=buildTree(inorder,postorder,0,i,0,i);
	    root.right=buildTree(inorder,postorder,i+1,l,i,l-1);
        return root;
	}
	public TreeNode buildTree(int []inorder,int []postorder,int il,int ir,int pl,int pr){
		if(il>=ir)return null;
		if(pl>=pr)return null;
		int i;
		TreeNode node=new TreeNode(postorder[pr-1]);
		System.out.println(node.val);
		for(i=il;i<ir;i++)
			if(inorder[i]==postorder[pr-1])break;
		node.left=buildTree(inorder,postorder,il,i,pl,pl+i-il);
		node.right=buildTree(inorder,postorder,i+1,ir,pr-ir+i,pr-1);
		return node;
	}
	public static void main(String []args){
		int []inorder={1,3,2};
		int []postorder={3,2,1};
		ConstructBinaryTreeFromInorderAndPostorderTraversal test=new ConstructBinaryTreeFromInorderAndPostorderTraversal();
		TreeNode root=test.buildTree(inorder, postorder);
		
	}
	
}
