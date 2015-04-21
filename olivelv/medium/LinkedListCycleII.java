package olivelv.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given a linked list, return the node where the cycle begins. If there is no
 * cycle, return null.
 * 
 * @author olivelv
 * @version time: 2015年4月21日 下午10:30:08
 * 
 */
public class LinkedListCycleII {
	public ListNode detectCycle1(ListNode head) {
		ListNode root=null;
		ListNode p=head;
		Set<ListNode>set=new HashSet<ListNode>();
		while(p!=null){
			if(set.contains(p))return p;
			set.add(p);
			p=p.next;
		}
		return null;
	}
	public ListNode detectCycle2(ListNode head) {
		ListNode root=null;
		ListNode p=head;
		Map<ListNode,Integer>map=new HashMap<ListNode,Integer>();
		while(p!=null){
			if(map.get(p)!=null)return p;
			map.put(p, 1);
			p=p.next;
		}
		return null;
	}
	//http://www.tuicool.com/articles/bi63ei
	public ListNode detectCycle(ListNode head) {
		ListNode slow=head,fast=head;
		while(fast!=null&&fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)return slow;
		}
		if (fast == null || fast.next == null) return null;
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
	}
}
