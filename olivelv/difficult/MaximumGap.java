package olivelv.difficult;

/**
 * Given an unsorted array, find the maximum difference between the successive
 * elements in its sorted form.
 * 
 * Try to solve it in linear time/space.
 * 
 * Return 0 if the array contains less than 2 elements.
 * 
 * You may assume all elements in the array are non-negative integers and fit in
 * the 32-bit signed integer range.
 * 
 * 
 * @author olivelv
 * @version time: 2015年6月1日 下午7:43:37
 */
/// the use of radix sort,learns from baidu
public class MaximumGap {
	public int[] RadixSort(int []nums){
		int n=nums.length;
		int [][]temp=new int[10][n];
		int []order=new int[10];
		int maxDigit=getMaxDigit(nums);
		int base=1;
		for(int i=0;i<maxDigit;i++){
			for(int j=0;j<n;j++){
				int lsd=(nums[j]/base)%10;
				temp[lsd][order[lsd]]=nums[j];
				order[lsd]++;
			}
			int k=0;
			for(int j=0;j<10;j++){
				if(order[j]!=0){
					for(int t=0;t<order[j];t++){
						nums[k++]=temp[j][t];
					}
					order[j]=0;
				}
			}
			base*=10;
		}
		return nums;
	}
	public int getMaxDigit(int []nums){
		int max=Integer.MIN_VALUE;
		int n=nums.length;
		for(int i=0;i<n;i++)
			if(max<nums[i])max=nums[i];
		int k=0;
		while(max!=0){
			max/=10;
			k++;
		}
		return k;
	}
	public int maximumGap(int[] nums) {
		int n=nums.length;
		if(n<2)return 0;
		nums=RadixSort(nums);
		int max=Integer.MIN_VALUE;
		/*for(int i=0;i<n;i++)
			System.out.println(nums[i]);*/
		for(int i=1;i<n;i++)
			if(max<nums[i]-nums[i-1])max=nums[i]-nums[i-1];
		return max;
	}
	public static void main(String []args){
		MaximumGap test=new MaximumGap();
		int []nums={1,10000000};
		System.out.println(test.maximumGap(nums));
	}
}
