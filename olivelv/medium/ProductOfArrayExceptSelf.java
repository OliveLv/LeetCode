package olivelv.medium;

/**
 * Given an array of n integers where n > 1, nums, return an array output such
 * that output[i] is equal to the product of all the elements of nums except
 * nums[i].
 * 
 * Solve it without division and in O(n).
 * 
 * For example, given [1,2,3,4], return [24,12,8,6].
 * 
 * ProductOfArrayExceptSelf.java
 * 
 * @author olivelv
 * @version time: Aug 5, 2015 10:48:33 PM
 */
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf1(int[] nums) {
		int n=nums.length;
		int []begin=new int[n+1];
		int []end=new int[n+1];
		int []res=new int[n];
		begin[0]=1;
		end[0]=1;
		for(int i=1;i<n;i++){
			begin[i]=begin[i-1]*nums[i-1];
			end[i]=end[i-1]*nums[n-i];
		}
		for(int i=0;i<n;i++){
			res[i]=begin[i]*end[n-i-1];
		}
		return res;
	}
	public int[] productExceptSelf(int[] nums) {
		int n=nums.length;
		int begin=1;
		int end=1;
		int []res=new int[n];
		for(int i=0;i<n;i++)res[i]=1;
		for(int i=0;i<n;i++){
			//begin[i]=begin[i-1]*nums[i-1];
			//end[i]=end[i-1]*nums[n-i];
			res[i]*=begin;
			begin*=nums[i];
			res[n-i-1]*=end;
			end*=nums[n-i-1];
			
		}
		return res;
	}
	public static void main(String []args){
		int []nums={1,2,3,4};
		ProductOfArrayExceptSelf test=new ProductOfArrayExceptSelf();
		test.productExceptSelf(nums);
	}
}
