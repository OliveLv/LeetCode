package olivelv.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers,
 * leaving only distinct numbers from the original list.
 * 
 * For example, Given 1->2->3->3->4->4->5, return 1->2->5. Given 1->1->1->2->3,
 * return 2->3.
 * 
 * 
 * @author olivelv
 * @version time: 2015年3月31日 下午6:47:19
 */
public class RemoveDuplicatesFromSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		ListNode root = new ListNode(0);
		root.next = head;
		// System.out.println("yes");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		ListNode p = head;
		while (p != null) {
			int val = p.val;
			Object obj = map.get(val);
			int cnt = obj == null ? 1 : (int) obj + 1;
			map.put(val, cnt);
			p = p.next;
		}
		// System.out.println("yes");
		p = root;
		while (p.next != null) {
			ListNode q = p.next;
			int val = q.val;
			// System.out.println(val);
			if ((int) map.get(val) > 1) {
				// System.out.println(val);
				p.next = q.next;
			} else
				p = p.next;
		}
		return root.next;
	}

	public static void main(String[] args) {

		int[] val = { 1, 1, 1, 2, 3 };
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		RemoveDuplicatesFromSortedListII test = new RemoveDuplicatesFromSortedListII();
		head = test.deleteDuplicates(head);

		while (head != null) {
			System.out.println(head.val);

			head = head.next;

		}
	}
}
