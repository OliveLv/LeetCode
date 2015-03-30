package olivelv.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
 Return [1,3,3,1]. 

Note:
 Could you optimize your algorithm to use only O(k) extra space? 

 * @author olive
 *
 */
public class PascalsTriangleII {
	long cnm(int n,int m){
		if(m==0||n==m)return 1;
		m=n-m>m?m:n-m;
		long c=1;
		for(long i=n,j=1;j<=m;i--,j++)c=c*i/j;
		return c;
	}
	 public List<Integer> getRow(int rowIndex) {
		 List<Integer>result=new ArrayList<Integer>();
		 for(int i=0;i<=rowIndex;i++)result.add((int)cnm(rowIndex,i));
		/* for(int ele:result){
			 System.out.print(ele+" ");
		 }
		 System.out.println();*/
	     return result;   
	    }
	 public static void main(String []args){
		 PascalsTriangleII test=new PascalsTriangleII();
		 test.getRow(1);
		 test.getRow(2);
		 test.getRow(3);
		 test.getRow(4);
		 test.getRow(5);
		 
	 }
}
