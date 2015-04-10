package olivelv.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a m x n grid filled with non-negative numbers, find a path from top
 * left to bottom right which minimizes the sum of all numbers along its path.
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月9日 下午3:59:04
 */
public class MinimumPathSum {
	class Node{
		int i;
		int j;
		int val;
		public Node(int i,int j,int val){
			this.i=i;
			this.j=j;
			this.val=val;
		}
		public Node top(int m,int n,int[][]grid){
			if(i-1<0)return null;
			return new Node(i-1,j,val+grid[i-1][j]);
		}
		public Node bottom(int m,int n,int[][]grid){
			if(i+1>=m)return null;
			return new Node(i+1,j,val+grid[i+1][j]);
		}
		public Node left(int m,int n,int[][]grid){
			if(j-1<0)return null;
			return new Node(i,j-1,val+grid[i][j-1]);
		}
		public Node right(int m,int n,int[][]grid){
			if(j+1>=n)return null;
			return new Node(i,j+1,val+grid[i][j+1]);
		}
	}
	int min(int a,int b){
		return a<b?a:b;
	}
	public int minPathSum(int[][] grid) {
		int m=grid.length;
		if(m==0)return 0;
		int n=grid[0].length;
		int [][]matrix=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(i==0&&j==0)matrix[i][j]=grid[i][j];
				if(i==0&&j!=0)matrix[i][j]=matrix[i][j-1]+grid[i][j];
				if(i!=0&&j==0)matrix[i][j]=grid[i][j]+matrix[i-1][j];
				if(i!=0&&j!=0)matrix[i][j]=grid[i][j]+min(matrix[i][j-1],matrix[i-1][j]);
			}
		
		}
		return matrix[m-1][n-1];
	}
	public static void main(String []args){
		int [][]grid={{1,3,1},{1,5,1},{4,2,1}};
		MinimumPathSum test=new MinimumPathSum();
		System.out.println(test.minPathSum(grid));
	}
}
