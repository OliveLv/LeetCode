package olivelv.medium;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月1日 下午5:41:23
 */
public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = new ListNode(0);
		ListNode p1 = l1, p2 = l2, p = head;
		int temp = 0;
		while (p1 != null && p2 != null) {
			temp += p1.val + p2.val;
			ListNode node = new ListNode(temp % 10);
			temp /= 10;
			p.next = node;
			p = node;
			p1=p1.next;
			p2=p2.next;
		}
		while (p1 != null) {
			temp += p1.val;
			ListNode node = new ListNode(temp % 10);
			temp /= 10;
			p.next = node;
			p = node;
			p1=p1.next;
		}
		while (p2 != null) {
			temp += p2.val;
			ListNode node = new ListNode(temp % 10);
			temp /= 10;
			p.next = node;
			p = node;
			p2=p2.next;
		}
		while(temp!=0){
			ListNode node = new ListNode(temp % 10);
			temp /= 10;
			p.next = node;
			p = node;
		}
		return head.next;
	}

	public static void main(String[] args) {

		int[] l1 = { 2, 4, 3 };
		ListNode head1 = new ListNode(l1[0]);
		ListNode p = head1;
		for (int i = 1; i < l1.length; i++) {
			ListNode q = new ListNode(l1[i]);
			p.next = q;
			p = q;
		}
		int[] l2 = { 5, 6, 4 };
		ListNode head2 = new ListNode(l2[0]);
		p = head2;
		for (int i = 1; i < l2.length; i++) {
			ListNode q = new ListNode(l2[i]);
			p.next = q;
			p = q;
		}
		AddTwoNumbers test = new AddTwoNumbers();
		ListNode head = test.addTwoNumbers(head1, head2);
		int ans = 0;
		while (head != null) {
			System.out.println(head.val);
			ans++;
			head = head.next;

		}
	}
}
