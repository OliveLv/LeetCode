package olivelv.medium;

/**
 * Write an efficient algorithm that searches for a value in an mXn matrix.This
 * matrix has the following properties:
 *  Integers in each row are sorted from left to right
 *  The first integer of each row is greater than the last integer of the previous row. 
 *  For example, 
 *  Consider the following matrix: 
 *  [ [1,3,5,7],
 * [10,11,16,20], 
 * [23,30,34,50] ] 
 * Given target=3,return true.
 * 
 * @author olivelv
 * @version time: 2015年4月11日 下午12:14:19
 */
public class SearchA2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
	    int m=matrix.length;
	    if(m==0)return false;
	    int n=matrix[0].length;
	    int l=0,r=m-1;
	    while(l<=r){
	    	int k=(l+r)/2;
	    	//System.out.println(l+" "+r);
	    	if(target==matrix[k][0])return true;
	    	if(target>matrix[k][0])l=k+1;
	    	if(target<matrix[k][0])r=k-1;
	    	
	    }
	   // System.out.println(l+" "+r);
	    if(r<0)return false;
	    for(int i=0;i<n;i++)if(matrix[r][i]==target)return true;
		return false;
	}
	public static void main(String []args){
		SearchA2DMatrix test=new SearchA2DMatrix();
		int [][]matrix={{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		//int [][]matrix={{1}};
		System.out.println(test.searchMatrix(matrix, 50));
	}
}
