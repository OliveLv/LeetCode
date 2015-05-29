package olivelv.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 * 
 * @author olivelv
 * @version time: 2015年5月29日 上午10:49:30
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		int n=nums.length;
		for(int i=0;i<n;i++){
			if(map.containsKey(nums[i])){
				return true;
			}else{
				map.put(nums[i], 1);
			}
		}
		/*for(int ele:map.keySet()){
			int val=map.get(ele);
			if(val>=2)return true;
		}*/
		return false;
	}
	public static void main(String []args){
		ContainsDuplicate test=new ContainsDuplicate();
		int []nums={1,2,3,1};
		System.out.println(test.containsDuplicate(nums));
	}
}
