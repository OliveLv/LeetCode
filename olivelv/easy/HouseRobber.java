package olivelv.easy;

/**
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月7日 下午11:13:38
 */
public class HouseRobber {
	public int rob(int[] nums) {
		int max=Integer.MIN_VALUE;
		int n=nums.length;
		if(n==0)return 0;
		int []dp=new int[n];
		if(n==1){
			return nums[0];
		}
		if(n==2){
			return nums[0]>nums[1]?nums[0]:nums[1];
		}
	    max=Math.max(nums[0], Math.max(nums[0]+nums[2], nums[1]));
		for(int i=0;i<2;i++)dp[i]=nums[i];
		dp[2]=nums[0]+nums[2];
		for(int i=3;i<n;i++){
			dp[i]=nums[i]+(dp[i-2]>dp[i-3]?dp[i-2]:dp[i-3]);
			if(max<dp[i])max=dp[i];
		}
		return max;
	}
	
	public static void main(String []args){
		HouseRobber test=new HouseRobber();
		int []nums={2,7,9,3,1};
		System.out.println(test.rob(nums));
	}
}
