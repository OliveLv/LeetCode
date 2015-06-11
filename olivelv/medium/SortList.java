package olivelv.medium;

/**
 * Sort a linked list in O(n log n) time using constant space complexity.
 * SortList.java
 * 
 * @author olivelv
 * @version time: Jun 9, 2015 7:45:13 PM
 */
public class SortList {
	public void print(ListNode begin){
		System.out.println("begin");
		while(begin!=null){
			System.out.println(begin.val);
			begin=begin.next;
		}
		System.out.println();
	}
	public ListNode merge(ListNode L,ListNode R){
		ListNode root=new ListNode(0);
		ListNode p=root;
		ListNode l=L;
		ListNode r=R;
		while(l!=null&&r!=null){
			if(l.val<r.val){
				p.next=l;
				p=p.next;
				l=l.next;
			}else{
				p.next=r;
				p=p.next;
				r=r.next;
			}
		}
		if(l!=null)p.next=l;
		if(r!=null)p.next=r;
		return root.next;
	}
	public ListNode mergeSort(ListNode head){
		if(head==null||head.next==null)return head;
		ListNode l=head;
		ListNode r=head.next;
		// find middle point of the list
		while(r!=null&&r.next!=null){
			r=r.next.next;
			l=l.next;
		}
		ListNode L=head;
		ListNode R=l.next;
		l.next=null;
		L=mergeSort(L);
		R=mergeSort(R);
		return merge(L,R);
	}
	public ListNode quickSort(ListNode head){
		if(head==null)return head;
		int val=head.val;
		ListNode lhead=new ListNode(0);
		ListNode root=new ListNode(0);
		root.next=head;
		ListNode p=head;
		ListNode q=lhead;
		ListNode r=root;
		while(p!=null){
			if(p.val<val){
				q.next=p;
				q=q.next;
				r.next=q.next;
			}else{
				r=r.next;
			}
			p=p.next;
		}
		lhead=quickSort(lhead.next);
		ListNode rhead=quickSort(root.next.next);
		if(lhead==null){
			lhead=new ListNode(val);
			lhead.next=rhead;
			return lhead;
		}
		p=lhead;
		//Cause TLE
		while(p.next!=null)p=p.next;
		p.next=new ListNode(val);
		p.next.next=rhead;
		return lhead;
	}
	public ListNode sortList(ListNode head) {
		head=mergeSort(head);
		//print(head);
		return head;
	}
	public static void main(String []args){
		SortList test=new SortList();
		int[] val = { 1, 4, 3, 2, 5, 2 };
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		head=test.sortList(head);
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
}
