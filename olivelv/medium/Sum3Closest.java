package olivelv.medium;

/**
 * Given an array S of n integers, find three integers in S such that the sum is
 * closest to a given number, target. Return the sum of the three integers. You
 * may assume that each input would have exactly one solution. For example,
 * given array S = {-1 2 1 -4}, and target = 1.
 * 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * 
 * 
 * @author olivelv
 * @version time: 2015年6月4日 上午8:47:20
 */
public class Sum3Closest {
	int min;
	int smin;
	public void dfs(int []nums,int idx,int s,int k,int target){
		if(k==0){
			if(Math.abs(s-target)<min){
				min=Math.abs(s-target);
				smin=s;
			}
		}
		if(idx>=nums.length)return ;
		dfs(nums,idx+1,s,k,target);
		dfs(nums,idx+1,s+nums[idx],k-1,target);
	}
	public int threeSumClosest(int[] nums, int target) {
		min=Integer.MAX_VALUE;
		smin=0;
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++)
				for(int k=j+1;k<nums.length;k++){
					int val=nums[i]+nums[j]+nums[k];
					if(Math.abs(val-target)<min){
						min=Math.abs(val-target);
						smin=val;
					}
					//if not this statement,it will get TLE
					if(min==0)return smin;
				}
		}
		//System.out.println(smin);
		return smin;
	}
	public static void main(String []args){
		Sum3Closest test=new Sum3Closest();
		int []nums={1,1,1,0};
		System.out.println(test.threeSumClosest(nums, 100));
	}
}
