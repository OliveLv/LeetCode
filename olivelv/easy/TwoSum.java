package olivelv.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月18日 下午3:02:12
 */
public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		int n=numbers.length;
		Map<Integer,Integer>map=new HashMap<Integer,Integer>();
		int []res=new int[2];
		for(int i=0;i<n;i++){
			map.put(numbers[i], i);
		}
		for(int i=0;i<n;i++){
			int val=target-numbers[i];
			if(map.get(val)!=null){
				int j=(Integer)map.get(val);
				if(i>=j)continue;
						res[0]=i+1;
						res[1]=j+1;
					return res;
			}
			
		}
		return res;
	}
	public static void main(String []args){
		int []a={2,7,11,15};
		TwoSum test=new TwoSum();
		int []b=test.twoSum(a, 9);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}
}
