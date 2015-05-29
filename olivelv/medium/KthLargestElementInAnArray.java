package olivelv.medium;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Find the kth largest element in an unsorted array. Note that it is the kth
 * largest element in the sorted order, not the kth distinct element.
 * 
 * For example, Given [3,2,1,5,6,4] and k = 2, return 5.
 * 
 * Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月29日 下午8:45:54
 */
public class KthLargestElementInAnArray {
	class myComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}

		
	}
	 public int findKthLargest(int[] nums, int k) {
		 int n=nums.length;
		 Queue<Integer>queue=new PriorityQueue<Integer>(n,new myComparator());
		 
		 for(int i=0;i<n;i++)
			 queue.add(nums[i]);
		 for(int i=0;i<k-1;i++){
			 queue.poll();
		 }
	       return queue.peek(); 
	    }
	 public static void main(String []args){
		 KthLargestElementInAnArray test=new KthLargestElementInAnArray();
		 int []nums={3,2,1,5,6,4};
		 System.out.println(test.findKthLargest(nums, 2));
	 }
}
