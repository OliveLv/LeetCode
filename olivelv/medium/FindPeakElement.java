package olivelv.medium;

/**
 * A peak element is an element that is greater than its neighbors.
 * 
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return
 * its index.
 * 
 * The array may contain multiple peaks, in that case return the index to any
 * one of the peaks is fine.
 * 
 * You may imagine that num[-1] = num[n] = -∞.
 * 
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function
 * should return the index number 2.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月10日 下午9:12:00
 */
public class FindPeakElement {
	public int findPeakElement(int[] num) {
		int n=num.length;
		if(n==0)return -1;
		if(n==1)return 0;
		for(int i=0;i<n;i++){
			if(i==0&&num[i]>num[i+1])return i;
			if(i==n-1&&num[i]>=num[i-1])return i;
			if(i!=0&&i!=n-1&&num[i]>=num[i-1]&&num[i]>num[i+1])return i;
		}
		return -1;
	}
	public static void main(String []args){
		int []a={1,2,3,1};
		FindPeakElement test=new FindPeakElement();
		System.out.println(test.findPeakElement(a));
	}
}
