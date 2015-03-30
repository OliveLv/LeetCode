package olivelv.difficult;

/**
 * Given an unsorted integer array, find the first missing positive integer.
 * 
 * For example, Given [1,2,0] return 3, and [3,4,-1,1] return 2.
 * 
 * Your algorithm should run in O(n) time and uses constant space
 * 
 * @author olive
 *
 */
public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
		//if(A.length==0)return 1;
        for(int i=0;i<A.length;i++){
        	if(A[i]<0)return i;
        }
        return A.length+1;
	}
}
