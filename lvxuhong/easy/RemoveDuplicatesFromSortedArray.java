package lvxuhong.easy;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] A) {
		int n=A.length;
		if(n==0)return n;
		int []B=new int[n];
		int k=0;
		B[k++]=A[0];
		for(int i=1;i<n;i++){
			if(A[i]!=B[k-1])B[k++]=A[i];
		}
		for(int i=0;i<k;i++)A[i]=B[i];
		return k;
	}
}
