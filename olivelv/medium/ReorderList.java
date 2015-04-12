package olivelv.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln, reorder it to:
 * L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 
 * You must do this in-place without altering the nodes' values.
 * 
 * For example, Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月12日 上午10:30:13
 */
public class ReorderList {
	public void print(ListNode head){
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
			
		}
	}
	public void reorderList(ListNode head) {
		List<Integer>list=new ArrayList<Integer>();
		Stack<Integer>stack=new Stack<Integer>();
		ListNode p=head;
		while(p!=null){
			list.add(p.val);
			stack.push(p.val);
			p=p.next;
		}
		p=head;
		int n=list.size();
		for(int i=0,j=n-1;i<=j;i++,j--){
			p.val=list.get(i);  // 对原有链表进行修改。。
			p=p.next;
			if(i==j)continue;
			p.val=stack.pop();
			p=p.next;
		}
		//print(head);
		
			
	}
	public static void main(String []args){
		ReorderList test=new ReorderList();
		int[] val = { 1,2,3};
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		test.reorderList(head);
	}
	
}
