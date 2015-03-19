package lvxuhong.medium;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.plaf.synth.SynthSpinnerUI;

/**
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0.
 * Do it in place.
 * 
 * @author xuhong
 *
 */
public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        if(n==0)return ;
        int m=matrix[0].length;
        Set<Integer>row=new HashSet<Integer>();
        Set<Integer>col=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        	for(int j=0;j<m;j++){
        		if(matrix[i][j]==0){
        			row.add(i);
        			col.add(j);
        		}
        	}
        for(int i:row){
        	for(int j=0;j<m;j++)
        		matrix[i][j]=0;
        }
        for(int j:col){
        	for(int i=0;i<n;i++)
        		matrix[i][j]=0;
        }
	}

	public void print(int[][] matrix, int n, int m) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int m = cin.nextInt();
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				matrix[i][j] = cin.nextInt();
		SetMatrixZeroes test = new SetMatrixZeroes();
		test.setZeroes(matrix);
		test.print(matrix, n, m);
		}
}
