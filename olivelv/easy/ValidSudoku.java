package olivelv.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * 
 * The Sudoku board could be partially filled, where empty cells are filled with
 * the character '.'.
 * 
 * 
 * 
 * 
 * A partially filled sudoku which is valid.
 * 
 * 
 * Note: A valid Sudoku board (partially filled) is not necessarily solvable.
 * Only the filled cells need to be validated.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月16日 下午5:11:42
 */
public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		int m=9,n=9;
		//row validate
		for(int i=0;i<m;i++){
			Set<Integer>set=new HashSet<Integer>();
			for(int j=0;j<n;j++){
				if(board[i][j]=='.')continue;
				if(set.contains(board[i][j]-'0'))return false;
				set.add(board[i][j]-'0');
			}
		}
		//col validate
		for(int j=0;j<m;j++){
			Set<Integer>set=new HashSet<Integer>();
			for(int i=0;i<n;i++){
				if(board[i][j]=='.')continue;
				if(set.contains(board[i][j]-'0'))return false;
				set.add(board[i][j]-'0');
			}
		}
		//3X3 validate
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				Set<Integer>set=new HashSet<Integer>();
				for(int k=0;k<3;k++){
					for(int t=0;t<3;t++){
					//System.out.print(i*3+k+" "+(j*3+t)+",");
				if(board[i*3+k][j*3+t]=='.')continue;
				if(set.contains(board[i*3+k][j*3+t]-'0'))return false;
				set.add(board[i*3+k][j*3+t]-'0');
					}
				}
				//System.out.println();
			}
			
		}
		return true;
	}
	public static void main(String []args){
		/*char[][]board={{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}};*/
	//	["....5..1.",".4.3.....",".....3..1","8......2.","..2.7....",".15......",".....2...",".2.9.....","..4......"]
		char[][]board={{'.','.','.','.','5','.','.','1','.'},
				{'.','4','.','3','.','.','.','.','.'},
				{'.','.','.','.','.','3','.','.','1'},
				{'8','.','.','.','.','.','.','2','.'},
				{'.','.','2','.','7','.','.','.','.'},
				{'.','1','5','.','.','.','.','.','.'},
				{'.','.','.','.','.','2','.','.','.'},
				{'.','2','.','9','.','.','.','.','.'},
				{'.','.','4','.','.','.','.','.','.'}};
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++)
				System.out.print(board[i][j]+" ");
			System.out.println();
		}
		ValidSudoku test=new ValidSudoku();
		System.out.println(test.isValidSudoku(board));
		;
	}
}
