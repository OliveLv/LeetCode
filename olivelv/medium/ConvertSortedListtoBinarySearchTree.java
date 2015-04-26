package olivelv.medium;

/**
 * Given a singly linked list where elements are sorted in ascending order,
 * convert it to a height balanced BST.
 * 
 * @author olivelv
 * @version time: 2015年4月26日 下午1:19:52
 */
public class ConvertSortedListtoBinarySearchTree {
	public TreeNode sortedListToBST(ListNode head) {
		TreeNode root=null;
		ListNode p=head;
		if(p==null)return root;
		int n=0;
		while(p!=null){
			n++;
			p=p.next;
		}
		int []list=new int[n];
		p=head;
		int k=0;
		while(p!=null){
			list[k++]=p.val;
			p=p.next;
		}
		root=buildTree(list,0,n-1);
		return root;
	}
	public TreeNode buildTree(int []num,int l,int r){
		int mid=(l+r+1)/2;
		if(l>r)return null;
		//System.out.println(l+" "+r+" "+num[mid]);
		TreeNode root=new TreeNode(num[mid]);
		root.left=buildTree(num,l,mid-1);
		root.right=buildTree(num,mid+1,r);
		return root;
	}
	public static void main(String []args){
		ListNode head=new ListNode(0);
		ConvertSortedListtoBinarySearchTree test=new ConvertSortedListtoBinarySearchTree();
		test.sortedListToBST(head);
	}
}
