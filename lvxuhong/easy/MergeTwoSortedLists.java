package lvxuhong.easy;

import java.util.Scanner;

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
public class MergeTwoSortedLists {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0),p=head;
        while(l1!=null&&l2!=null){
        	if(l1.val<l2.val){
        		p.next=l1;
        		l1=l1.next;
        	}else{
        		p.next=l2;
        		l2=l2.next;
        	}
        	p=p.next;
        }
        if(l1!=null){
        	p.next=l1;
        }
        if(l2!=null){
        	p.next=l2;
        }
        return head.next;
    }
public static void main(String []args){
	Scanner cin=new Scanner(System.in);
	int n=cin.nextInt();
	int val=cin.nextInt();
	ListNode head1=new ListNode(val),p=head1;
	for(int i=1;i<n;i++){
		val=cin.nextInt();
		ListNode q=new ListNode(val);
		p.next=q;
		p=q;
	}
	System.out.println("yes1");
	n=cin.nextInt();
	val=cin.nextInt();
	ListNode head2=new ListNode(val);
	p=head2;
	for(int i=1;i<n;i++){
		val=cin.nextInt();
		ListNode q=new ListNode(val);
		p.next=q;
		p=q;
	}
	System.out.println("yes2");
	MergeTwoSortedLists test=new MergeTwoSortedLists();
	p=test.mergeTwoLists(head1, head2);
	while(p!=null){
		System.out.println(p.val);
		p=p.next;
	}
}
}
