package olivelv.difficult;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * The array may contain duplicates.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月8日 下午10:39:27
 */
public class FindMinimumInRotatedSortedArrayII {
	public int findMin(int[] num) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++)
			if(min>num[i])min=num[i];
		return min;
	}
}
