package olivelv.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Follow up for "Remove Duplicates": What if duplicates are allowed at most
 * twice?
 * 
 * For example, Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 * 
 * @author olivelv
 * @version time: 2015年3月30日 下午10:18:18
 */
public class RemoveDuplicatesFromSortedArrayII {
	public int removeDuplicates(int[] A) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = A.length, k = 0;
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			Object obj = map.get(A[i]);
			int count = 0;
			if (obj == null) {
				count = 1;
			} else {
				count = (Integer) obj + 1;
			}
			map.put(A[i], count);
			if (count <= 2)
				B[k++] = A[i];

		}
		for (int i = 0; i < k; i++)
			A[i] = B[i];
		return k;
	}
}
