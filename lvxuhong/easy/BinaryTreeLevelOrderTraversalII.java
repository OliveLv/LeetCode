package lvxuhong.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
 Given binary tree {3,9,20,#,#,15,7},

    3
   / \
  9  20
    /  \
   15   7



return its bottom-up level order traversal as:

[
  [15,7],
  [9,20],
  [3]
]


 * @author xuhong
 *
 */
public class BinaryTreeLevelOrderTraversalII {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
		 List<List<Integer>>order=new ArrayList<List<Integer>>();
		
	        if(root==null)return order;
	        List<TreeNode>cur=new ArrayList<TreeNode>();
	        cur.add(root);
	        while(!cur.isEmpty()){
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
	        List<List<Integer>>order2=new ArrayList<List<Integer>>();
	        int n=order.size();
	        for(int i=n-1;i>=0;i--){
	        	order2.add(order.get(i));
	        }
	        /*System.out.println(n);
	        for(List<Integer>a:order2){
	        	for(int x:a)System.out.print(x+" ");
	        	System.out.println();
	        }*/
	        return order2;
	    }
	 public static void main(String []args){
		 TreeNode root=new TreeNode(1);
		 root.right=new TreeNode(2);
		 TreeNode p=root.right;
		 p.left=new TreeNode(3);
		 BinaryTreeLevelOrderTraversalII test=new BinaryTreeLevelOrderTraversalII();
		// test.preorderTraversal(root);
		 test.levelOrderBottom(root);
	 }
}
