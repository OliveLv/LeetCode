package olivelv.medium;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of
 * islands. An island is surrounded by water and is formed by connecting
 * adjacent lands horizontally or vertically. You may assume all four edges of
 * the grid are all surrounded by water.
 * 
 * Example 1: 11110 11010 11000 00000
 * 
 * Answer: 1
 * 
 * Example 2: 11000 11000 00100 00011
 * 
 * Answer: 3
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月13日 下午3:00:08
 */
public class NumberOfIslands {
	int [][]flag;
	public int numIslands(char[][] grid) {
		int m=grid.length;
		if(m==0)return 0;
		int n=grid[0].length;
		System.out.println(m+" "+n);
		flag=new int[m][n];
		//flag[0][0]=1;
		int s=0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(flag[i][j]==0&&grid[i][j]=='1'){
					
					dfs(i,j,grid);
				    s++;	
				}
			}
		}
		return s;
	}
	public void dfs(int i,int j,char [][]grid){
		int m=grid.length;
		int n=grid[0].length;
		flag[i][j]=1;
		if(i-1>=0&&flag[i-1][j]==0&&grid[i-1][j]=='1')dfs(i-1,j,grid);
		if(i+1<m&&flag[i+1][j]==0&&grid[i+1][j]=='1')dfs(i+1,j,grid);
		if(j-1>=0&&flag[i][j-1]==0&&grid[i][j-1]=='1')dfs(i,j-1,grid);
		if(j+1<n&&flag[i][j+1]==0&&grid[i][j+1]=='1')dfs(i,j+1,grid);
		
	}
	public static void main(String []args){
		NumberOfIslands test=new NumberOfIslands();
		//11110 11010 11000 00000
		//char [][]grid={{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
		//11000 11000 00100 00011
		//char [][]grid={{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
		char [][]grid={{'1'}};
		System.out.println(test.numIslands(grid));
	}
}
