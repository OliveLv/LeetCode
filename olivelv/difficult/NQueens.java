package olivelv.difficult;

import java.util.ArrayList;
import java.util.List;

/**
 * The n-queens puzzle is the problem of placing n queens on an n¡Án chessboard
 * such that no two queens attack each other. Given an integer n, return all
 * distinct solutions to the n-queens puzzle.
 * 
 * Each solution contains a distinct board configuration of the n-queens'
 * placement, where 'Q' and '.' both indicate a queen and an empty space
 * respectively.
 * 
 * For example, There exist two distinct solutions to the 4-queens puzzle:
 * 
 * NQueens.java
 * 
 * @author olivelv
 * @version time: Jun 6, 2015 11:56:51 AM
 */
public class NQueens {
	List<String[]>res;
	public String genStr(int j,int n){
		String str="";
		for(int i=0;i<n;i++)
			if(i==j)str+='Q';
			else
				str+=".";
		return str;
	}
	public void dfs(int i,int n,int []cols,int []x,int []y,String []str){
		if(i==n){
			String []s=new String[n];
			for(int k=0;k<n;k++)
				s[k]=new String(str[k]);
			res.add(s);
			return ;
		}
		for(int j=0;j<n;j++)
			if(cols[j]==0&&x[i-j+n]==0&&y[i+j]==0){
				cols[j]=1;
				x[i-j+n]=1;
				y[i+j]=1;
				str[i]=genStr(j,n);
				dfs(i+1,n,cols,x,y,str);
				cols[j]=0;
				x[i-j+n]=0;
				y[i+j]=0;
			}
	}
	public List<String[]> solveNQueens(int n) {
        res=new ArrayList<String[]>();
        dfs(0,n,new int[n],new int[2*n],new int[2*n],new String[n]);
       /* System.out.println(res.size());
        for(String []ele:res){
        	for(int i=0;i<n;i++){
        		System.out.println(ele[i]);
        	}
        	System.out.println();
        }*/
        return res;
	}
	public static void main(String []args){
		NQueens test=new NQueens();
		System.out.println(test.solveNQueens(4));
	}
}
