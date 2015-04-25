package olivelv.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, flatten it to a linked list in-place.
 * 
 * For example, Given 1 / \ 2 5 / \ \ 3 4 6
 * 
 * 
 * The flattened tree should look like: 1 \ 2 \ 3 \ 4 \ 5 \ 6
 * 
 * Hints: If you notice carefully in the flattened tree, each node's right child
 * points to the next node of a pre-order traversal.
 * 
 * 
 * Show Tags
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月25日 上午11:25:28
 */
public class FlattenBinaryTreetoLinkedList {
	
	public void print(TreeNode root){
		while(root!=null){
			System.out.println(root.val);
			System.out.println(root.left);
			root=root.right;
		}
	}
	// non-recursive pre-order
	public void flatten(TreeNode root){
		if(root==null)return ;
		Stack<TreeNode>stack=new Stack<TreeNode>();
		List<Integer>list=new ArrayList<Integer>();
		stack.push(root);
		TreeNode q=root;
		while(!stack.isEmpty()){
			TreeNode p=stack.pop();
			list.add(p.val);
			if(p.right!=null)stack.push(p.right);
			if(p.left!=null)stack.push(p.left);
			
		}
		for(int i=1;i<list.size();i++){
			q.right=new TreeNode(list.get(i));
			q.left=null;
			q=q.right;
		}
	}
	// recursive pre-order
	public void flatten1(TreeNode root) {
		if(root==null)return ;
		List<Integer>list=new ArrayList<Integer>();
		preorder(root,list);
		TreeNode q=root;
		for(int i=1;i<list.size();i++){
			q.right=new TreeNode(list.get(i));
			q.left=null;
			q=q.right;
		}
		
	}
	public void preorder(TreeNode root,List<Integer>list){
		if(root==null)return ;
		list.add(root.val);
		if(root.left!=null){
			preorder(root.left,list);
		}
		if(root.right!=null){
			preorder(root.right,list);
		}
	}
	public static void main(String []args){
		FlattenBinaryTreetoLinkedList test=new FlattenBinaryTreetoLinkedList();
		int []num={1,2,3,4,5,6};
		ConvertSortedArraytoBinarySearchTree tree=new ConvertSortedArraytoBinarySearchTree();
		TreeNode root=tree.sortedArrayToBST(num);
	/*	TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);*/
		test.flatten(root);
		test.print(root);
	}
}
