package olivelv.easy;

/**
 * Write a function to delete a node (except the tail) in a singly linked list,
 * given only access to that node.
 * 
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node
 * with value 3, the linked list should become 1 -> 2 -> 4 after calling your
 * function
 * 
 * DeleteNodeInaLinkedList.java
 * 
 * @author olivelv
 * @version time: Jul 15, 2015 5:05:14 PM
 */
public class DeleteNodeInaLinkedList {
	public void deleteNode(ListNode node) {
		ListNode p=node.next;
		while(true){
			node.val=p.val;
			if(p.next==null)break;
			node=node.next;
			p=p.next;
		}
		node.next=null;
	}
	public static void main(String []args){
		int[] val = { 0,1};
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		DeleteNodeInaLinkedList test=new DeleteNodeInaLinkedList();
		test.deleteNode(head);
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
}
