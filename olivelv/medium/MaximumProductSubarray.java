package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * which has the largest product.
 * 
 * For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has
 * the largest product = 6.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月18日 下午3:16:13
 */
public class MaximumProductSubarray {
	public int maxProduct(List<Integer> nums) {
		int n=nums.size();
		if(n==0)return 0;
	    int max=nums.get(0),curMax=nums.get(0),curMin=nums.get(0);
	    for(int i=1;i<n;i++){
	    	int tmp=curMax;
	    	int val=nums.get(i);
	    	curMax=Math.max(Math.max(val, val*curMin), val*curMax);
	    	curMin=Math.min(Math.min(val, val*tmp), val*curMin);
	    	if(max<curMax)max=curMax;
	    }
	    
		return max;
	}
	// solution gets TLE
	int max;
	public int maxProduct2(List<Integer> nums) {
		max=Integer.MIN_VALUE;
		int n=nums.size();
		if(n==0)return 0;
		dfs(nums,0,1);
		return max;
	}
	public void dfs(List<Integer>nums,int i,int s){
		if(i==nums.size())return  ;
		int x=nums.get(i);
		if(s>max)max=s;
		dfs(nums,i+1,s*x);
		dfs(nums,i+1,x);
		
	}
	public static void main(String []ags){
		MaximumProductSubarray test=new MaximumProductSubarray();
		List<Integer>nums=new ArrayList<Integer>();
		nums.add(2);
		nums.add(3);
		nums.add(-2);
		nums.add(4);
		System.out.println(test.maxProduct(nums));
	}
}
