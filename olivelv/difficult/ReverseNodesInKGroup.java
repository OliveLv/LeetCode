package olivelv.difficult;

import java.util.Stack;


/**
 * Given a linked list, reverse the nodes of a linked list k at a time and
 * return its modified list.
 * 
 * If the number of nodes is not a multiple of k then left-out nodes in the end
 * should remain as it is.
 * 
 * You may not alter the values in the nodes, only nodes itself may be changed.
 * 
 * Only constant memory is allowed.
 * 
 * For example, Given this linked list: 1->2->3->4->5
 * 
 * For k = 2, you should return: 2->1->4->3->5
 * 
 * For k = 3, you should return: 3->2->1->4->5
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月29日 下午4:17:31
 */
public class ReverseNodesInKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		if (k <= 1 || head == null)
			return head;
		Stack<Integer> stack = new Stack<Integer>();
		ListNode root = new ListNode(0);
		root.next = head;
		ListNode q = head;
		ListNode p = head;
		while (q != null) {
			q = p;
			int i;
			for(i=0;i<k&&q!=null;i++) {
				stack.push(q.val);
				q = q.next;
			}
			if(q==null&&i<k)break;
			while (!stack.isEmpty()) {
				p.val = stack.pop();
				p = p.next;
			}
		}
		return root.next;
	}
	public static void main(String []args){
		ReverseNodesInKGroup test=new ReverseNodesInKGroup();
		int []val={1,2,3};
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		head=test.reverseKGroup(head, 2);
		while (head != null) {
			System.out.println(head.val);
			head = head.next;

		}
	}

}
