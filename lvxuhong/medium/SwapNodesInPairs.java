package lvxuhong.medium;
/**
 * Given a linked list, swap every two adjacent nodes and return its head. 
 * For example,Given 1->2->3->4, you should return the list as 2->1->4->3. 
Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed. 
 * @author xuhong
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val=x;
		next=null;
	}
}
public class SwapNodesInPairs {
	 public ListNode swapPairs(ListNode head) {
			
		 if(head==null||head.next==null)return head;
		  ListNode p=head;
		 ListNode q=null;
		 do{
			 q=p.next;
			 int temp=p.val;
			 p.val=q.val;
			 q.val=temp;
			 p=q.next;
			 
		 }while(p!=null&&p.next!=null);
	        return head;
	    }
}
