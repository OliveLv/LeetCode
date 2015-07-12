package olivelv.easy;

import olivelv.medium.RemoveDuplicatesFromSortedListII;

/**
 * Given a singly linked list, determine if it is a palindrome.
 * 
 * Follow up: Could you do it in O(n) time and O(1) space?
 * 
 * PalindromeLinkedList.java
 * 
 * @author olivelv
 * @version time: Jul 12, 2015 1:45:47 PM
 */
public class PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		ListNode p1=head,p2=head;
		ListNode root=null;
		ListNode q=root;
		if(head==null||head.next==null)return true;
		while(p2!=null&&p2.next!=null){
		    q=root;
		    root=p1;
			p1=p1.next;
			p2=p2.next.next;
			root.next=q;
			
		}
		if(p2!=null)p1=p1.next;
		while(p1!=null&&root!=null){
			if(p1.val!=root.val)return false;
			p1=p1.next;
			root=root.next;
		}
		/*System.out.println(p2==null);
		while(p1!=null){
			System.out.println(p1.val);
			p1=p1.next;
		}
		
		while(root!=null){
			System.out.println(root.val);
			root=root.next;
		}*/
		return true;
	}
	public static void main(String[] args) {

		int[] val = { 4, 3, 2, 3 ,4};
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		PalindromeLinkedList test=new PalindromeLinkedList();
		System.out.println(test.isPalindrome(head));
	}
}
