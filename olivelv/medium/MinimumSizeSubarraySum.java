package olivelv.medium;

/**
 * Given an array of n positive integers and a positive integer s, find the
 * minimal length of a subarray of which the sum ≥ s. If there isn't one, return
 * 0 instead.
 * 
 * For example, given the array [2,3,1,2,4,3] and s = 7, the subarray [4,3] has
 * the minimal length under the problem constraint.
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月31日 上午9:52:11
 */
public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
		int begin=0,end=0;
		int n=nums.length;
		if(n==0)return 0;
		if(n==1){
			if(nums[0]>=s)return 1;
			return 0;
		}
		int sum=0;
		int min=Integer.MAX_VALUE;
		while(begin<n&&end<n){
			sum+=nums[end++];
			if(sum>=s){
				//System.out.println(sum+" "+begin+" "+end);
				while(sum>=s&&begin<end){
					sum-=nums[begin];
					begin++;
				}
				if(min>end-begin)min=end-begin+1;
			}
			//end++;
		}
		if(min==Integer.MAX_VALUE)return 0;
		return min;
	}
	public static void main(String []args){
		MinimumSizeSubarraySum test=new MinimumSizeSubarraySum();
		int []nums={1,1};
		System.out.println(test.minSubArrayLen(3, nums));
	}
}
