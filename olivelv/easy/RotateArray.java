package olivelv.easy;

/**
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 * step 1:[7,1,2,3,4,5,6]
 * step 2:[6,7,1,2,3,4,5]
 * step 3:[5,6,7,1,2,3,4]
 * Note: Try to come up as many solutions as you can, there are at least 3
 * different ways to solve this problem.
 * 
 * @author olive
 *
 */
public class RotateArray {
	public void rotate(int[] nums, int k) {
         int l=nums.length;
         k=k%l;
         int []temp=new int[l];
         for(int j=k,i=0;i<l;i++,j=(j+1)%l){
        	 temp[j]=nums[i];
         }
         for(int i=0;i<l;i++){
        	 nums[i]=temp[i];
         }
	}
}
