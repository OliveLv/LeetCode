package olivelv.difficult;

import java.util.HashMap;
import java.util.Map;

/**
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null. 

 Return a deep copy of the list. 

 * 
 * @author olivelv
 * @version time: 2015年5月1日 下午1:33:02
 */
/**
 * Definition for singly-linked list with a random pointer. class RandomListNode
 * { int label; RandomListNode next, random; RandomListNode(int x) { this.label
 * = x; } };
 */
class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
}

public class CopyListWithRandomPointer {
	public RandomListNode copyRandomList(RandomListNode head) {
		RandomListNode root = new RandomListNode(0);
		if (head == null)
			return root.next;
		Map<Integer, RandomListNode> map = new HashMap<Integer, RandomListNode>();
		RandomListNode p = head;
		RandomListNode q = root;
		while (p != null) {
			int val = p.label;
			q.next = new RandomListNode(val);
			map.put(val, q.next);
			q = q.next;
			p = p.next;
		}
		p = head;
		q = root.next;
		while (p != null) {
			RandomListNode r = p.random;
			if (r != null) {
				int val = r.label;
				q.random = map.get(val);
			}
			p = p.next;
			q = q.next;
		}
		return root.next;
	}
}
