package olivelv.difficult;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity. 
 * 
 * @author olivelv
 * @version time: 2015年4月13日 下午11:15:09
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
public class MergeKSortedLists {
	 public ListNode mergeKLists2(List<ListNode> lists) {
		 if(lists.isEmpty())return null;
		 int n=lists.size();
		 ListNode list=lists.get(0);
		 if(n==1)return list;
		 for(int i=1;i<n;i++){
			 ListNode root=new ListNode(0);
			 ListNode r=root;
			 ListNode l=lists.get(i);
			 ListNode p=list;
			 ListNode q=l;
			 while(q!=null&&p!=null){
				 
				 if(q.val>p.val){
					 r.next=p;
					 r=r.next;
					 p=p.next; 
				 }else{
					 r.next=q;
					 r=r.next;
					 q=q.next;
				 }
			 }
			 if(q!=null){
				 r.next=q;
			 }
			 if(p!=null){
				 r.next=p;
			 }
			 list=root.next;
		 }
		 return list;
	        
	    } 
	 public ListNode mergeKLists(List<ListNode> lists){
		 if(lists.isEmpty())return null;
		 int n=lists.size();
		 ListNode list=lists.get(0);
		 if(n==1)return list;
		 Comparator<ListNode> Order =  new Comparator<ListNode>(){

			@Override
			public int compare(ListNode a, ListNode b) {
				// TODO Auto-generated method stub
				return a.val-b.val;
			} };
		 Queue<ListNode> queue=new PriorityQueue<ListNode>(n,Order);
		 ListNode root=new ListNode(0);
		 ListNode r=root;
		 for(int i=0;i<n;i++){
			 ListNode p=lists.get(i);
			 if(p!=null)queue.add(p);
		 }
		 while(!queue.isEmpty()){
		 
		 ListNode q=queue.poll();
		// System.out.println(q.val);
		 r.next=q;
		 r=r.next;
		 q=q.next;
		 if(q!=null){
			 queue.add(q);
			 
		 }
		 }
		 return root.next;
	 }
     //[{2},{},{-1}]
	 public static void main(String []args){
		 ListNode root1=new ListNode(2);
		 ListNode root2=new ListNode(-1);
		 List<ListNode>l1=new ArrayList<ListNode>();
		 
		 l1.add(root1);
		 l1.add(null);
		 l1.add(root2);
		 MergeKSortedLists test=new MergeKSortedLists();
		 ListNode root=test.mergeKLists(l1);
		 while(root!=null){
			 System.out.println(root.val);
			 root=root.next;
		 }
		 
	 }
}
