package olivelv.medium;

import java.util.Arrays;

/**
 * Implement next permutation, which rearranges numbers into the
 * lexicographically next greater permutation of numbers.
 * 
 * If such arrangement is not possible, it must rearrange it as the lowest
 * possible order (ie, sorted in ascending order).
 * 
 * The replacement must be in-place, do not allocate extra memory.
 * 
 * Here are some examples. Inputs are in the left-hand column and its
 * corresponding outputs are in the right-hand column. 
 * 1,2,3 → 1,3,2 
 * 3,2,1 →1,2,3
 * 1,1,5 → 1,5,1
 * [1,3,2] → [2,1,3] 
 * 
 * 1,2,3 → 1,3,2 → 2,1,3 → 2,3,1 → 3,1,2 → 3,2,1
 * @author olivelv
 * @version time: 2015年4月29日 下午3:45:44
 */
public class NextPermutation {
	public void nextPermutation(int[] num) {
		int n=num.length;
		int i;
		for(i=n-2;i>=0;i--){
			int min=num[i];
			int idx=i;
			for(int j=i+1;j<n;j++){
				if(num[j]>num[i]){
					if(min==num[i]){
						min=num[j];
						idx=j;
					}else
						if(min>num[j]){
							min=num[j];
							idx=j;
					}
				}
			}
			if(idx!=i){
				swap(num,i,idx);
				break;
			}
		}
		Arrays.sort(num,i+1,n);
		/*for(i=0;i<n;i++)
			System.out.print(num[i]+" ");*/
	}
	public void swap(int []num,int i,int j){
		int tmp=num[i];
		num[i]=num[j];
		num[j]=tmp;
	}
	public static void main(String []args){
		NextPermutation test=new NextPermutation();
		int []num={2,1,3};
		test.nextPermutation(num);
	}
}
