package olivelv.difficult;

/**
 * Follow up for N-Queens problem.
 * 
 * Now, instead outputting board configurations, return the total number of
 * distinct solutions.
 * 
 * NQueensII.java
 * 
 * @author olivelv
 * @version time: Jun 6, 2015 11:42:04 AM
 */
public class NQueensII {
	int num=0;
	public void dfs(int i,int n,int []cols,int []x,int []y){
		if(i==n){
			num++;
			return ;
		}
		for(int j=0;j<n;j++)
			if(cols[j]==0&&x[i-j+n]==0&&y[i+j]==0){
				cols[j]=1;
				x[i-j+n]=1;
				y[i+j]=1;
				dfs(i+1,n,cols,x,y);
				cols[j]=0;
				x[i-j+n]=0;
				y[i+j]=0;
			}
	}
	public int totalNQueens(int n) {
		num=0;
		dfs(0,n,new int[n],new int[2*n],new int[2*n]);
		return num;
	}
	public static void main(String []args){
		NQueensII test=new NQueensII();
		System.out.println(test.totalNQueens(2));
	}
}
