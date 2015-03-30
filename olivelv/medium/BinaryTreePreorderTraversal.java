package olivelv.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.

For example:
 Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3


 * @author xuhong
 *
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val=x;
	}
}
public class BinaryTreePreorderTraversal {
	 public List<Integer> preorderTraversal(TreeNode root) {
	        List<Integer>order=new ArrayList<Integer>();
	        if(root==null)return order;
	        //’ª µœ÷
	   /*     TreeNode p=root;
	        
	        Stack<TreeNode> stack=new Stack<TreeNode>();
	        stack.push(p);
	        while(!stack.isEmpty()){
	        	p=stack.pop();
	        	order.add(p.val);
	        	if(p.right!=null)stack.push(p.right);
	        	if(p.left!=null)stack.push(p.left);
	        }*/
	        preorderTraversals(root, order);
	        /*System.out.println(order.size());
	        for(int ele:order){
	        	System.out.print(ele+" ");
	        }*/
	        return order;
	    }
	 public void preorderTraversals(TreeNode root,List<Integer>order){
		   if(root!=null)order.add(root.val);
		   if(root.left!=null)this.preorderTraversals(root.left,order);
		   if(root.right!=null)this.preorderTraversals(root.right,order);
	 }
	 public static void main(String []args){
		 TreeNode root=new TreeNode(1);
		 root.right=new TreeNode(2);
		 TreeNode p=root.right;
		 p.left=new TreeNode(3);
		 BinaryTreePreorderTraversal test=new BinaryTreePreorderTraversal();
		// test.preorderTraversal(root);
		 test.preorderTraversal(root);
	 }
}
