package olivelv.medium;

/**
 * Given an array where elements are sorted in ascending order, convert it to a
 * height balanced BST.
 * 
 * @author olivelv
 * @version time: 2015年4月25日 上午10:54:58
 */
public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num) {
		TreeNode root=null;
		if(num.length==0)return root;
		root=buildTree(num,0,num.length-1);
		return root;
	}
	public TreeNode buildTree(int []num,int l,int r){
		int mid=(l+r+1)/2;
		if(l>r)return null;
		//System.out.println(l+" "+r+" "+num[mid]);
		TreeNode root=new TreeNode(num[mid]);
		root.left=buildTree(num,l,mid-1);
		root.right=buildTree(num,mid+1,r);
		return root;
	}
	public static void main(String []args){
		int []num={1,2,3};
		ConvertSortedArraytoBinarySearchTree test=new ConvertSortedArraytoBinarySearchTree();
		test.sortedArrayToBST(num);
	}
}
