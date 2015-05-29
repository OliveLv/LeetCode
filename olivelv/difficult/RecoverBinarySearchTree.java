package olivelv.difficult;
/**
 * morris inorder traversal 
 * 
 * @author olivelv
 * @version time: 2015年5月25日 上午11:03:07
 */
public class RecoverBinarySearchTree {
	public void bst_morris_inorder(TreeNode root){
		TreeNode p=root,tmp;
		TreeNode []val=new TreeNode[2];
		int k=0;
		int pre=0;
		boolean flag=false;
		while(p!=null){
			if(p.left==null){
				if(flag&&pre<p.val)val[k++]=p;
				if(!flag)flag=true;
				pre=p.val;
				//System.out.println(p.val);
				p=p.right;
			}else{
				tmp=p.left;
				while(tmp.right!=null&&tmp.right!=p)
					tmp=tmp.right;
				if(tmp.right==null){
					tmp.right=p;
					p=p.left;
				}else{
					if(flag&&pre<p.val)val[k++]=p;
					if(!flag)flag=true;
					pre=p.val;
					tmp.right=null;
					p=p.right;
				}
			}
		}
		pre=val[0].val;
		val[0].val=val[1].val;
		val[1].val=pre;
		
	}
	public void recoverTree(TreeNode root) {
		TreeNode p=root,tmp;
		TreeNode first=null,second=null;
		TreeNode pre=new TreeNode(Integer.MIN_VALUE);
	//	boolean flag=false;
		while(p!=null){
			if(p.left!=null){
				tmp=p.left;
				while(tmp.right!=null&&tmp.right!=p)tmp=tmp.right;
				if(tmp.right==null){
					tmp.right=p;
					p=p.left;
					continue;
				}else
					tmp.right=null;
			}
			if(p.val<pre.val){
				if(first==null)first=pre;
				second=p;
			}
			pre=p;
			p=p.right;
		}
	    int temp=first.val;
	    first.val=second.val;
	    second.val=temp;
	}
	public static void main(String []args){
		RecoverBinarySearchTree test=new RecoverBinarySearchTree();
		TreeNode root=new TreeNode(0);
		root.left=new TreeNode(1);
		test.recoverTree(root);
	}
}
