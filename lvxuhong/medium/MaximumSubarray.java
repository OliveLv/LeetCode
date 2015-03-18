package lvxuhong.medium;

import java.util.Scanner;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum. 

For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 the contiguous subarray [4,−1,2,1] has the largest sum = 6. 

 * @author xuhong
 *
 */
public class MaximumSubarray {
	 public int maxSubArray(int[] A) {
		 int max=Integer.MIN_VALUE,s=0,n=A.length;
		// System.out.println(max);
		 for(int i=0;i<n;i++){
			 s+=A[i];
			 if(s<A[i])s=A[i];
			 if(s>max)max=s;
		 }
	     return max;   
	    }
	 public static void main(String []args){
		 Scanner cin=new Scanner(System.in);
		 int n=cin.nextInt();
		 int []A=new int[n];
		 for(int i=0;i<n;i++)A[i]=cin.nextInt();
		 MaximumSubarray test=new MaximumSubarray();
		 System.out.println(test.maxSubArray(A));
	 }
}
