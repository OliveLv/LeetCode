package lvxuhong.medium;

import java.util.HashSet;

public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        String s = null;
        HashSet<String> h = new HashSet<String>();
        while (head != null) {
            s = head.toString();
            if (h.contains(s)) {
                return true;
            } else {
                h.add(s);
                head = head.next;
            }
        }
        return false;
    }

}
