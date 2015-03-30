package olivelv.medium;

/**
 * Sort a linked list using insertion sort.
 * 
 * @author olive
 *
 */
public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		ListNode head2 = new ListNode(0);
		head2.next = head;
		ListNode p = head2;
		ListNode h = head;
		while (h != null) {
			ListNode r = h;
			int min = Integer.MAX_VALUE;
			ListNode q = h;
			while (q != null) {
				if (min > q.val) {
					r = q;
					min = q.val;
				}
				q = q.next;
			}
			int tmp = r.val;
			r.val = h.val;
			h.val = tmp;
			h = h.next;
		}
		return head2.next;
	}

	public static void main(String[] args) {

		int[] val = { 1, 4, 3, 2, 5, 2 };
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		InsertionSortList test = new InsertionSortList();
		head = test.insertionSortList(head);
		int ans = 0;
		while (head != null) {
			System.out.println(head.val);
			ans++;
			head = head.next;

		}
	}
}
