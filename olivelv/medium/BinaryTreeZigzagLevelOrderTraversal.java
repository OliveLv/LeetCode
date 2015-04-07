package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

import olivelv.easy.BinaryTreeLevelOrderTraversal;

/**
 * Given a binary tree, return the zigzag level order traversal of its nodes'
 * values. (ie, from left to right, then right to left for the next level and
 * alternate between).
 * 
 * For example: Given binary tree {3,9,20,#,#,15,7},
 * 
 * 3 / \ 9 20 / \ 15 7
 * 
 * 
 * 
 * return its zigzag level order traversal as:
 * 
 * [ [3], [20,9], [15,7] ]
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月7日 下午8:35:29
 */
public class BinaryTreeZigzagLevelOrderTraversal {
	 public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
	        int ans=0;
	        for(List<Integer>a:order){
	        	if(ans%2!=0){
	        		List<Integer>list=new ArrayList<Integer>();
	        		for(int i=a.size()-1;i>=0;i--)list.add(a.get(i));
	        		order.set(ans, list);
	        	}
	        	ans++;
	        	
	        	
	        }
	        /*for(List<Integer>a:order){
	        	for(int x:a)System.out.print(x+" ");
	        	System.out.println();
	        }*/
	        return order;
	    }
	 public static void main(String []args){
		 TreeNode root=new TreeNode(3);
		 root.right=new TreeNode(20);
		 root.left=new TreeNode(9);
		 TreeNode p=root.right;
		 p.left=new TreeNode(15);
		 p.right=new TreeNode(7);
		 BinaryTreeZigzagLevelOrderTraversal test=new BinaryTreeZigzagLevelOrderTraversal();
		// test.preorderTraversal(root);
		 test.zigzagLevelOrder(root);
	 }
}
