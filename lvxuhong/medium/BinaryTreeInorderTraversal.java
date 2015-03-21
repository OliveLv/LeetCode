package lvxuhong.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer>order=new ArrayList<Integer>();
	        if(root==null)return order;
	        inorderTraversal(root,order);
	       /* for(int ele:order){
	        	System.out.print(ele+" ");
	        }*/
	       //貌似需要两个栈才能实现
	        return order;
	    }
	 public void inorderTraversal(TreeNode root,List<Integer>order){
		 if(root==null)return ;
		 if(root.left!=null)inorderTraversal(root.left,order);
		 order.add(root.val);
		 if(root.right!=null)inorderTraversal(root.right,order);
		 
		 
	 }
	 public static void main(String []args){
		 TreeNode root=new TreeNode(1);
		 root.right=new TreeNode(2);
		 TreeNode p=root.right;
		 p.left=new TreeNode(3);
		 BinaryTreeInorderTraversal test=new BinaryTreeInorderTraversal();
		// test.preorderTraversal(root);
		 test.inorderTraversal(root);
	 }
}
