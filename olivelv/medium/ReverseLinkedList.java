package olivelv.medium;

import java.util.Stack;
// 3ms
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
// 0ms
public class Solution {
   public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode p=head;
        ListNode root=new ListNode(0);
        while(p!=null){
            ListNode q=p.next;
            p.next=root.next;
            root.next=p;
            p=q;
        }
        return root.next;
    }
}
