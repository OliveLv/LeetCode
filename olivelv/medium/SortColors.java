package olivelv.medium;



/**
 * Given an array with n objects colored red, white or blue, sort them so that
 * objects of the same color are adjacent, with the colors in the order red,
 * white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
 * and blue respectively.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月10日 下午9:22:34
 */
public class SortColors {
	public void sortColors(int[] A) {
		int n=A.length;
		int []a=new int[3];
		for(int i=0;i<n;i++){
			a[A[i]]++;
		}
		int k=0;
		for(int i=0;i<3;i++)
			for(int j=0;j<a[i];j++)
				A[k++]=i;
	}
}
