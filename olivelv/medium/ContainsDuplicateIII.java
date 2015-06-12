package olivelv.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Given an array of integers, find out whether there are two distinct indices i
 * and j in the array such that the difference between nums[i] and nums[j] is at
 * most t and the difference between i and j is at most k.
 * ContainsDuplicateIII.java
 * 
 * @author olivelv
 * @version time: Jun 11, 2015 6:58:39 PM
 */
public class ContainsDuplicateIII {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
		int n=nums.length;
		if(n==0)return false;
        TreeSet<Integer>set=new TreeSet<>();// using class Set may not have method subSet()
        for(int i=0;i<n;i++){
        	int floor=nums[i]-t;
        	int ceil=nums[i]+t+1;
        	if ((long) nums[i] - (long) (t) < -2147483647) floor = Integer.MIN_VALUE;
            if ((long) nums[i] + (long) (t) + 1 > 2147483646)  ceil = Integer.MAX_VALUE;

        	if(t>=0&&set.subSet(floor,ceil).size()!=0)return true;
        	set.add(nums[i]);
        	if(i>=k)set.remove(nums[i-k]);
        }
		return false;
	}
	

	public static void main(String []args){
		int []nums={1,3,6,2,2};
		ContainsDuplicateIII test=new ContainsDuplicateIII();
		System.out.println(test.containsNearbyAlmostDuplicate(nums, 1, 2));
	}
}
