package olivelv.medium;

/**
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell, where
 * "adjacent" cells are those horizontally or vertically neighboring. The same
 * letter cell may not be used more than once.
 * 
 * For example, Given board = [ ["ABCE"], ["SFCS"], ["ADEE"] ]
 * 
 * word = "ABCCED", -> returns true, word = "SEE", -> returns true, word =
 * "ABCB", -> returns false.
 * 
 * @author olivelv
 * @version time: 2015年5月2日 下午7:59:12
 */
public class WordSearch {
	boolean valid=false;
	int [][]flag;
	int n,m;
	public boolean exist(char[][] board, String word) {
		valid=false;
		m=board.length;
		if(m==0)return valid;
		n=board[0].length;
		if(word.length()>m*n)return valid;
		if(word.length()==0)return valid;
		flag=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++)
				if(flag[i][j]==0&&word.charAt(0)==board[i][j]&&!valid){
					dfs(board,word,1,i,j);
				}
		}
		return valid;
	}
	public void dfs(char [][]board,String word,int idx,int i,int j){
		if(word.length()==idx||valid){
			valid=true;
			return ;
		}
		flag[i][j]=1;
		char val=word.charAt(idx);
		idx++;
		if(j+1<n&&flag[i][j+1]==0&&val==board[i][j+1])dfs(board,word,idx,i,j+1);
		if(j-1>=0&&flag[i][j-1]==0&&val==board[i][j-1])dfs(board,word,idx,i,j-1);
		if(i-1>=0&&flag[i-1][j]==0&&val==board[i-1][j])dfs(board,word,idx,i-1,j);
		if(i+1<m&&flag[i+1][j]==0&&val==board[i+1][j])dfs(board,word,idx,i+1,j);
		flag[i][j]=0;
	}
	public static void main(String []args){
		char [][]board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		WordSearch test=new WordSearch();
	    System.out.println(test.exist(board, "SEE"));
	}
}
