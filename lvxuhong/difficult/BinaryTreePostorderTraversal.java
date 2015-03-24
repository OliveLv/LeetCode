package lvxuhong.difficult;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import lvxuhong.medium.BinaryTreeInorderTraversal;






/**
 * Given a binary tree, return the postorder traversal of its nodes' values.

For example:
 Given binary tree {1,#,2,3},

   1
    \
     2
    /
   3



return [3,2,1]. 

 * @author xuhong
 *
 */
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val=x;
	}
}
public class BinaryTreePostorderTraversal {
	 public List<Integer> postorderTraversal(TreeNode root) {
		 List<Integer>order=new ArrayList<Integer>();
		 if(root==null)return order;
		/* Stack<TreeNode>stack=new Stack<TreeNode>();
		 stack.push(root);
		 while(!stack.isEmpty()){
			 TreeNode p=stack.pop();
			 if(p.right!=null)stack.push(p.right);
			 if(p.left!=null)stack.push(p.left);
			 order.add(p.val); 
			 System.out.println(stack.size());
			 
		 }
		*/
		 postorderTraversal(root,order);
		  /*for(int ele:order){
		     	System.out.print(ele+" ");
		     }*/
	       return order; 
	    }
	 public void postorderTraversal(TreeNode root,List<Integer>order){
		 if(root==null)return ;
		 if(root.left!=null)postorderTraversal(root.left,order);
		 if(root.right!=null)postorderTraversal(root.right,order);
		 order.add(root.val);
	 }
	 public static void main(String []args){
		 TreeNode root=new TreeNode(1);
		 root.right=new TreeNode(2);
		 TreeNode p=root.right;
		 p.left=new TreeNode(3);
		 BinaryTreePostorderTraversal test=new BinaryTreePostorderTraversal();
		// test.preorderTraversal(root);
		 test.postorderTraversal(root);
	 }
}
