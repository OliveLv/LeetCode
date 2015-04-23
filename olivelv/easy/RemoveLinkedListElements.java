package olivelv.easy;

/**
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6 
 * Return: 1 --> 2--> 3 --> 4 --> 5
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月23日 下午3:42:39
 */
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode root=new ListNode(0);
		root.next=head;
		ListNode p=root,q=head;
		while(q!=null){
			if(q.val==val){
				p.next=q.next;
				q=q.next;
			}else{
			p=p.next;
			q=q.next;
			}
		}
		return root.next;
	}
}
