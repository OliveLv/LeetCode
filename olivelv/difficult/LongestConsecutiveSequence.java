package olivelv.difficult;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an unsorted array of integers, find the length of the longest
 * consecutive elements sequence.
 * 
 * For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements
 * sequence is [1, 2, 3, 4]. Return its length: 4.
 * 
 * Your algorithm should run in O(n) complexity.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月27日 下午10:23:18
 */
public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		int max=1;
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		int n=nums.length;
		if(n<=1)return n;
		for(int i=0;i<n;i++){
			if(map.containsKey(nums[i]))continue;
			int begin=nums[i];
			int end=nums[i];
			map.put(nums[i], 1);
			if(map.containsKey(nums[i]-1)){
				begin=nums[i]-map.get(nums[i]-1);
			}
			if(map.containsKey(nums[i]+1)){
				end=nums[i]+map.get(nums[i]+1);
			}
			map.put(begin, end-begin+1);
			map.put(end, end-begin+1);
			if(max<end-begin+1)max=end-begin+1;
		}
		return max;
	}
	public static void main(String []args){
		LongestConsecutiveSequence test=new LongestConsecutiveSequence();
		int []nums={100,4,200,1,3,2};
		System.out.println(test.longestConsecutive(nums));
	}
}
