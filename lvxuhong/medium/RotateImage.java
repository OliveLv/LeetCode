package lvxuhong.medium;

import java.util.Scanner;

/**
 * You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

 * @author xuhong
 *
 */
public class RotateImage {
	public void rotate(int[][] matrix) {
		int n=matrix.length;
		int m=matrix[0].length;
		int [][]temp=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
				temp[j][m-i-1]=matrix[i][j];
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)matrix[i][j]=temp[i][j];
		}
		/*for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)System.out.print(temp[i][j]+" ");
			System.out.println();
		}
*/
	}
	 public static void main(String []args){
		 Scanner cin=new Scanner(System.in);
		 int n=cin.nextInt();
		 int m=cin.nextInt();
		 int [][]A=new int[n][m];
		 for(int i=0;i<n;i++)
			 for(int j=0;j<m;j++)
				 A[i][j]=cin.nextInt();
		 RotateImage test=new RotateImage();
		 test.rotate(A);
	 }
}
