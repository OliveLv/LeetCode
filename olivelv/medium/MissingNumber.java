package olivelv.medium;
import java.util.*;

/**
** author:olive
**
**/
public class MissingNumber{
	public int missingNumber(int[] nums) {
        int n=nums.length;
        int s=n%2==0?n/2*(n+1):(n+1)/2*n;
        for(int i=0;i<n;i++)
        	s-=nums[i];
        return s;
    }
	public static void main(String []args){
		//Scanner cin=new Scanner(System.in);
		int []nums={0,1,3};
		MissingNumber test=new MissingNumber();
		System.out.println(test.missingNumber(nums));
	}
}