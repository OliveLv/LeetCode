package olivelv.medium;

/**
 * Given a linked list and a value x, partition it such that all nodes less than
 * x come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the
 * two partitions.
 * 
 * For example, Given 1->4->3->2->5->2 and x = 3, return 1->2->2->4->3->5.
 * 
 * @author olive
 *
 */
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		ListNode root=new ListNode(0);
		root.next=head;
		ListNode p=root;
		ListNode q=head;
		ListNode headl=new ListNode(0);
		ListNode l=headl;
		ListNode headr=new ListNode(0);
		ListNode r=headr;
		while(q!=null){
			//System.out.println(q.val);
			if(q.val<x){
				l.next=q;
				l=l.next;
				p.next=q.next;
				q=q.next;
			}else{
				r.next=q;
				r=r.next;
				p.next=q.next;
				q=q.next;
			}
		}
		l.next=headr.next;
		r.next=null;
        return headl.next;
	}
	public static void main(String []args){
		
		//int []val={1,4,3,2,5,2};
		int []val={1};
		ListNode head=new ListNode(val[0]);
		ListNode p=head;
		for(int i=1;i<val.length;i++){
			ListNode q=new ListNode(val[i]);
			p.next=q;
			p=q;
		}
		PartitionList test=new PartitionList();
		head=test.partition(head, 2);
		int ans=0;
		while(head!=null){
			System.out.println(head.val);
			ans++;
			head=head.next;
			
		}
	}
}
