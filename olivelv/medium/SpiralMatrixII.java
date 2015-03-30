package olivelv.medium;

/**
 * Given an integer n, generate a square matrix filled with elements from 1 to
 * n2 in spiral order.
 * 
 * For example, Given n = 3, You should return the following matrix: [ [ 1, 2, 3
 * ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]
 * 
 * 
 * @author olive
 *
 */
public class SpiralMatrixII {
	public void print(int [][]matrix,int n){
		int i,j;
		 for(i=0;i<n;i++){
          	for(j=0;j<n;j++)
          		System.out.print(matrix[i][j]+" ");
          	System.out.println();
          }
     	 	System.out.println();
	}
	public int[][] generateMatrix(int n) {
        int [][]matrix=new int[n][n];
        int s=1;
        int stepr=n,stepc=n-2,stp=0,sdp=n-1,i,j;
        do{
        	for(i=0;i<stepr&&s<=n*n;i++)matrix[stp][i+stp]=s++;
        //	print(matrix,n);
        	for(j=0;j<stepc&&s<=n*n;j++)matrix[j+stp+1][sdp]=s++;
        //	print(matrix,n);
        	for(i=stepr-1;i>=0&&s<=n*n;i--)matrix[sdp][i+stp]=s++;
        //	print(matrix,n);
        	for(j=0;j<stepc&&s<=n*n;j++)matrix[sdp-j-1][stp]=s++;
       // 	print(matrix,n);
        	stp++;
        	sdp--;
        	stepr-=2;
        	stepc=stepr-2;
        	
        }while(stp<=sdp&&s<=n*n);
       print(matrix,n);
        return matrix;
	}
	public static void main(String []args){
		SpiralMatrixII test=new SpiralMatrixII();
		test.generateMatrix(0);
		test.generateMatrix(2);
		test.generateMatrix(3);
		test.generateMatrix(4);
		test.generateMatrix(5);
	}
}
