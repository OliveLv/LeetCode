package olivelv.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * For example, given the following binary tree:
 * 
 * 
 * 1 / \ 2 3 \ 5
 * 
 * 
 * 
 * All root-to-leaf paths are: ["1->2->5", "1->3"]
 * 
 * BinaryTreePaths.java
 * 
 * @author olivelv
 * @version time: Aug 16, 2015 9:07:05 PM
 */
public class BinaryTreePaths {
	List<String>res;
	public void dfs(TreeNode root,String str){
        if(root==null)return ;
		str+=root.val+"->";

	//	System.out.println(str);
		if(root.left!=null)dfs(root.left,str);
		if(root.right!=null)dfs(root.right,str);
		if(root.left==null&&root.right==null){
			int n=str.length();
			res.add(new String(str.substring(0, n-2)));
			str=str.substring(0, n-3);
			return; 
		}
		
	}
	public List<String> binaryTreePaths(TreeNode root) {
		res=new ArrayList<String>();
		dfs(root,"");
		for(String str:res){
			System.out.println(str);
		}
		return res;
	}
	public static void main(String []args){
		BinaryTreePaths test=new BinaryTreePaths();
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.right=new TreeNode(5);
		test.binaryTreePaths(root);
	}
}
