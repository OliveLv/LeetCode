package olivelv.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers and an integer k, return true if and only if there
 * are two distinct indices i and j in the array such that nums[i] = nums[j] and
 * the difference between i and j is at most k.
 * 
 * @author olivelv
 * @version time: 2015年5月29日 下午8:39:00
 */
public class ContainsDuplicateII {
public boolean containsNearbyDuplicate(int[] nums, int k) {
     int n=nums.length;
     Map<Integer,Integer>map=new HashMap<Integer,Integer>();
     for(int i=0;i<n;i++){
    	 if(map.containsKey(nums[i])){
    		 int idx=map.get(nums[i]);
    		 if(i-idx<=k)return true;
    		
    	 } map.put(nums[i], i);
     }
	return false;
    }
public static void main(String []args){
	ContainsDuplicateII test=new ContainsDuplicateII();
	int nums[]={99,99};
	System.out.println(test.containsNearbyDuplicate(nums, 2));
}
}
