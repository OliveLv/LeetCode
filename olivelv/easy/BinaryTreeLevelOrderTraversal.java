package olivelv.easy;

import java.util.ArrayList;
import java.util.List;

import olivelv.medium.BinaryTreeInorderTraversal;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
 Given binary tree {3,9,20,#,#,15,7},

    3
   / \
  9  20
    /  \
   15   7



return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]


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
public class BinaryTreeLevelOrderTraversal {
	 public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>>order=new ArrayList<List<Integer>>();
	        if(root==null)return order;
	        List<TreeNode>cur=new ArrayList<TreeNode>();
	        cur.add(root);
	        while(!cur.isEmpty()){
	        //	List<Integer>nextlist=new ArrayList<Integer>();
	        	List<TreeNode>next=new ArrayList<TreeNode>();
	        	List<Integer>curlist=new ArrayList<Integer>();
	        	for(TreeNode p:cur){
	        		curlist.add(p.val);
	        		if(p.left!=null)next.add(p.left);
	        		if(p.right!=null)next.add(p.right);
	        	}
	        	order.add(curlist);
	        	cur=next;
	        }
	        /*for(List<Integer>a:order){
	        	for(int x:a)System.out.print(x+" ");
	        	System.out.println();
	        }*/
	        return order;
	    }
	 public static void main(String []args){
		 TreeNode root=new TreeNode(1);
		 root.right=new TreeNode(2);
		 TreeNode p=root.right;
		 p.left=new TreeNode(3);
		 BinaryTreeLevelOrderTraversal test=new BinaryTreeLevelOrderTraversal();
		// test.preorderTraversal(root);
		 test.levelOrder(root);
	 }
}
