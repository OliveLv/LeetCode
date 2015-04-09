package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * For example: Given the following binary tree,
 * 
 * 1 <--- / \ 2 3 <--- \ \ 5 4 <---
 * 
 * 
 * 
 * You should return [1, 3, 4].
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月7日 下午9:03:06
 */
public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
       List<Integer>list=new ArrayList<Integer>();
       List<List<Integer>>order=new ArrayList<List<Integer>>();
       if(root==null)return list;
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
       for(List<Integer>a:order)list.add(a.get(a.size()-1));
       return list;
	}
}
