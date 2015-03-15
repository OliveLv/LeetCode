package lvxuhong.medium;

import java.util.Scanner;

/***
 * Problem :Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *          You may assume no duplicates in the array.
 *          Here are few examples.
 *          [1,3,5,6], 5 ¡ú 2
 *          [1,3,5,6], 2 ¡ú 1
 *          [1,3,5,6], 7 ¡ú 4
 *          [1,3,5,6], 0 ¡ú 0 
 *         
 *         
 * @author xuhong
 *
 */
public class SearchInsertPosition {
	 public int searchInsert(int[] A, int target) {
	        int l=0,r=A.length-1;
	        while(l<=r){
	        	int m=(l+r)/2;
	        	if(A[m]==target)return m;
	        	if(A[m]>target)r=m-1;
	        	else
	        		l=m+1;
	        }
	        return l;
	    }
	 public static void main(String []args){
		 Scanner cin=new Scanner(System.in);
		 int n;
		 n=cin.nextInt();
		 int A[]=new int[n];
		 for(int i=0;i<n;i++)A[i]=cin.nextInt();
		 while(cin.hasNext()){
		 int target=cin.nextInt();
		 SearchInsertPosition test=new SearchInsertPosition();
		 System.out.println(test.searchInsert(A, target));
		 }
	 }
}
