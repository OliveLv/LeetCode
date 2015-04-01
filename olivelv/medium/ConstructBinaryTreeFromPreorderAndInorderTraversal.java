package olivelv.medium;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note: You may assume that duplicates do not exist in the tree.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月1日 下午5:00:29
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		int l=preorder.length;
		if(l==0)return null;
		TreeNode root=new TreeNode(preorder[0]);
		//System.out.println(root.val);
		int i;
		for(i=0;i<l;i++)
			if(inorder[i]==preorder[0])break;
		root.left=buildTree(preorder,inorder,1,i+1,0,i);
		root.right=buildTree(preorder,inorder,i+1,l,i+1,l);
         return root;
	}
	public TreeNode buildTree(int[] preorder, int[] inorder,int pl,int pr,int il,int ir){
		if(pl>=pr)return null;
		if(il>=ir)return null;
		TreeNode root=new TreeNode(preorder[pl]);
		//System.out.println(root.val);
		int i;
		for(i=il;i<ir;i++)
			if(inorder[i]==preorder[pl])break;
		root.left=buildTree(preorder,inorder,pl+1,pl+1-il+i,il,i);
		root.right=buildTree(preorder,inorder,pr+i+1-ir,pr,i+1,ir);
		return root;
	}
	/*public TreeNode buildTree(int[] inorder, int[] postorder) {
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
	}*/
	public static void main(String []args){
		int []preorder={1,2,4,5,3,6,7};
		int []inorder={4,2,5,1,6,3,7};
		ConstructBinaryTreeFromPreorderAndInorderTraversal test=new ConstructBinaryTreeFromPreorderAndInorderTraversal();
		TreeNode root=test.buildTree(preorder, inorder);
		
	}
}
