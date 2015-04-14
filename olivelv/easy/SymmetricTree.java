package olivelv.easy;

import java.util.ArrayList;
import java.util.List;

import olivelv.medium.BinaryTreePreorderTraversal;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * 
 * For example, this binary tree is symmetric: 1 / \ 2 2 / \ / \ 3 4 4 3
 * 
 * 
 * 
 * But the following is not:
 * 
 * 1 / \ 2 2 \ \ 3 3
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月14日 下午10:12:51
 */
public class SymmetricTree {
	public void print(List<String>order){
		for(String ele:order){
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	public boolean isSymmetric(TreeNode root) {
		if(root==null)return true;
        List<String>order1=new ArrayList<String>();
        this.preorderTraversals(root, order1);
        List<String>order2=new ArrayList<String>();
        this.preorderTraversals2(root, order2);
      //  print(order1);
      //  print(order2);
        for(int i=0;i<order1.size();i++){
        	//System.out.println(order1.get(i)+" "+order2.get(i));
        	if(!order1.get(i).equals(order2.get(i)))return false;
        }
        return true;
	}
	 public void preorderTraversals(TreeNode root,List<String>order){
		   if(root!=null)order.add(String.valueOf(root.val));
		   else{
			   order.add("#");
			   return ;
		   }
			  
		   this.preorderTraversals(root.left,order);
		   this.preorderTraversals(root.right,order);
	 }
	 public void preorderTraversals2(TreeNode root,List<String>order){
		   if(root!=null)order.add(String.valueOf(root.val));
		   else
			   {
			   order.add("#");
			   return ;
			   }
		   this.preorderTraversals2(root.right,order);
		   this.preorderTraversals2(root.left,order);
		   
	 }
	 public static void main(String []args){
		 TreeNode root=new TreeNode(1);
		 root.left=new TreeNode(2);
		 root.right=new TreeNode(2);
		 TreeNode p=root.right;
		 p.right=new TreeNode(3);
		 p=root.left;
		 p.right=new TreeNode(3);
		 SymmetricTree test=new SymmetricTree();
		 System.out.println(test.isSymmetric(root));
	 }
}
