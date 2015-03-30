package olivelv.medium;

import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
	 public int findMin(int[] num) {
	        int n=num.length;
	        for(int i=1;i<n;i++)
	        	if(num[i]<num[i-1])return num[i];
	        return num[0];
	    }
	 public static void main(String []args){
		 Scanner cin=new Scanner(System.in);
		 int n;
		 n=cin.nextInt();
		 int A[]=new int[n];
		 for(int i=0;i<n;i++)A[i]=cin.nextInt();
		 FindMinimumInRotatedSortedArray test=new FindMinimumInRotatedSortedArray();
		 System.out.println(test.findMin(A));
		
	 }
}
