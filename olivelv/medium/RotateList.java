package olivelv.medium;

/**
 * Given a list, rotate the list to the right by k places, where k is
 * non-negative.
 * 
 * For example: Given 1->2->3->4->5->NULL and k = 2, return 4->5->1->2->3->NULL.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月13日 下午3:19:09
 */
public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
		if(k==0||head==null)return head;
		ListNode r=head;
		int ans=0;
		while(r!=null){
			r=r.next;
			ans++;
		}
		k=k%ans;
		ListNode root=new ListNode(0);
		root.next=head;
		ListNode p=root;
		ListNode q=root;
		for(int i=0;i<k;i++){
			//System.out.println(q.val);
			q=q.next;
		}
		while(q!=null&&q.next!=null){
			//System.out.println(q.val);//q.val
			p=p.next;
			q=q.next;
		}
		//System.out.println(p.val+" "+q.val);
		q.next=head;
		head=p.next;
		p.next=null;
		//System.out.println("yes");
		/*while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}*/
         return head;
	}
	public static void main(String []args){
		int[] val = { 1,2,3,4,5};
		ListNode head = new ListNode(val[0]);
		ListNode p = head;
		for (int i = 1; i < val.length; i++) {
			ListNode q = new ListNode(val[i]);
			p.next = q;
			p = q;
		}
		RotateList test=new RotateList();
		test.rotateRight(head, 2);
	}
}
