package olivelv.easy;

/**
 * Given a linked list, remove the nth node from the end of list and return its
 * head.
 * 
 * For example, Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked list becomes
 * 1->2->3->5.
 * 
 * 
 * @author olive
 *
 */
public class RemoveNthNodeFromEndOfList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p=new ListNode(0);
		ListNode k=p;
		p.next=head;
		ListNode  q = head;
		int i;
		for (i = 0; q != null && i <n; i++) {
			q = q.next;
		}
		if (q==null&&i != n) {
			//System.out.println("yes");
			return head;
		}
		while (q != null) {
			p = p.next;
			q = q.next;
		}
		ListNode r = p.next;
		p.next = r.next;
		return k.next;

	}
	public static void main(String []args){
		RemoveNthNodeFromEndOfList test=new RemoveNthNodeFromEndOfList();
		ListNode head=new ListNode(1);
		/*ListNode p=head;
		for(int i=2;i<=5;i++){
			ListNode q=new ListNode(i);
			p.next=q;
			p=q;
		}*/
		head=test.removeNthFromEnd(head, 1);
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
}
