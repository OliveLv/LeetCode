package lvxuhong.medium;

/**
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example: Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * 
 * return 1->4->3->2->5->NULL.
 * 
 * Note: Given m, n satisfy the following condition: 1 ¡Ü m ¡Ü n ¡Ü length of list.
 * 
 * @author xuhong
 *
 */
public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if(head==null)return head;
		ListNode root = new ListNode(0);
		root.next = head;
		while(m<=n){
		ListNode p = root;
		int ans = 0;
		while (p != null) {
			ans++;
			p = p.next;
			if (ans == m)
				break;
		}
		//System.out.println(p.val);
		ListNode q = root;
		ans = 0;
		while (q != null) {
			ans++;
			q = q.next;
			if (ans == n)
				break;
		}
		//System.out.println(q.val);
		int tmp = p.val;
		p.val = q.val;
		q.val = tmp;
		m++;
		n--;
		}
		return head;
	}
	public static void main(String[] args) {
		 int []val={1,2,3,4};
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		ReverseLinkedListII test = new ReverseLinkedListII();
		head = test.reverseBetween(head, 1, 4);
		int ans = 0;
		while (head != null) {
			System.out.println(head.val);
			ans++;
			head = head.next;

		}
	}
}
