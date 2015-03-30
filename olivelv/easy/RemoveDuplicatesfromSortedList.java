package olivelv.easy;

import java.util.Scanner;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode p = head;
		while (p!=null&&p.next!= null) {
			ListNode q = p.next;
			if (p.val == q.val)p.next = q.next;
			else p=q;
		}
		return head;
	}
	public static void main(String []args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int val=cin.nextInt();
		ListNode head=new ListNode(val),p=head;
		for(int i=1;i<n;i++){
			val=cin.nextInt();
			ListNode q=new ListNode(val);
			p.next=q;
			p=q;
		}
		System.out.println("yes1");
		RemoveDuplicatesfromSortedList test=new RemoveDuplicatesfromSortedList();
		p=test.deleteDuplicates(head);
		System.out.println("yes2");
		while(p!=null){
			System.out.println(p.val);
			p=p.next;
		}
	}

}
