package olivelv.medium;

import java.util.Stack;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if(head==null)return head;
		Stack<Integer>stack=new Stack<Integer>();
		ListNode p=head;
		while(p!=null){
			stack.push(p.val);
			p=p.next;
		}
		p=head;
		while(p!=null){
			p.val=stack.pop();
			p=p.next;
		}
		return head;
	}
}
