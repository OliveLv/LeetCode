package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * For example, Given the following matrix: [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8,9
 * ] ]
 * 
 * 
 * You should return [1,2,3,6,9,8,7,4,5].
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月2日 下午7:13:19
 */
public class SpiralMatrix {
	/*
	 * public List<Integer> spiralOrder(int[][] matrix) { List<Integer>list=new
	 * ArrayList<Integer>(); int n=matrix.length; if(n==0)return list; int
	 * m=matrix[0].length; int s=1; System.out.println(m+" "+n); int
	 * stepr=m,stepc=n-2,stp=0,sdp=n-1,i,j; do{ for(i=0;i<stepr&&s<=n*m;i++){
	 * s++; //System.out.println(stp+" "+i+stepr); list.add(matrix[stp][i+stp]);
	 * } // print(matrix,n); for(j=0;j<stepc&&s<=n*m;j++){ s++;
	 * System.out.println(j+" "+stp+" "+sdp); list.add(matrix[j+stp+1][sdp]); }
	 * // print(matrix,n); for(i=stepr-1;i>=0&&s<=n*m;i--){ s++; //
	 * System.out.println(sdp+" "+stp+" "+i);
	 * 
	 * list.add(matrix[sdp][i+stp]); } // print(matrix,n);
	 * for(j=0;j<stepc&&s<=n*m;j++){ s++; list.add(matrix[sdp-j-1][stp]); } //
	 * print(matrix,n); stp++; sdp--; stepr-=2; stepc-=2;
	 * 
	 * }while(stp<=sdp&&s<=n*m); for(int ele:list){ System.out.println(ele); }
	 * return list; }
	 */
	/// not mine!!!!!!
	public List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> record = new ArrayList<Integer>();
		if (matrix.length == 0)
			return record;
		int m = matrix.length;
		int n = matrix[0].length;
		int col = n;
		int lrow = 0;
		int row = m;
		int lcol = 0;
		int count = 0;
		while (true) {
			for (int i = lcol; i < col; i++) {
				record.add(matrix[lrow][i]);
				count++;
				if (count == m * n)
					return record;
			}
			lrow++;
			for (int i = lrow; i < row; i++) {
				record.add(matrix[i][col - 1]);
				count++;
				if (count == m * n)
					return record;
			}
			col--;
			for (int i = col - 1; i >= lcol; i--) {
				record.add(matrix[row - 1][i]);
				count++;
				if (count == m * n)
					return record;
			}
			row--;
			for (int i = row - 1; i >= lrow; i--) {
				record.add(matrix[i][lcol]);
				count++;
				if (count == m * n)
					return record;
			}
			lcol++;

		}

	}

	public static void main(String[] args) {
		int[][] matrix = { { 7 }, { 9 }, { 6 } };
		SpiralMatrix test = new SpiralMatrix();
		test.spiralOrder(matrix);
	}
}
