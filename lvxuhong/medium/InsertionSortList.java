package lvxuhong.medium;
/**
 * Sort a linked list using insertion sort.
 * @author xuhong
 *
 */
public class InsertionSortList {
public ListNode insertionSortList(ListNode head) {
       ListNode head2=new ListNode(0);
       head2.next=head;
       
       while(head2!=null){
    	   ListNode p=head2;
    	   ListNode q=head2.next;
    	   int min=Integer.MAX_VALUE;
    	   while(p!=null&&p.next!=null){
    		   if(min>p.val){
    			   q=p;
    			   min=p.val;
    		   }
    	   }
       }
       return head2;
    }
}
