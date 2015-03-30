package olivelv.difficult;

/**
 * Given two words word1 and word2, find the minimum number of steps required to
 * convert word1 to word2. (each operation is counted as 1 step.)
 * 
 * You have the following 3 operations permitted on a word:
 * 
 * a) Insert a character b) Delete a character c) Replace a character
 * 
 * @author olive
 *
 */
public class EditDistance {
	public int minDistance(String word1, String word2) {
		int l1 = word1.length();
		int l2 = word2.length();
		if (l1 == 0 && l2 == 0)
			return 0;
		if (l1 ==0)
			return l2;
		if (l2 ==0)
			return l1;
		int [][]dp=new int[l1+1][l2+1];
		for(int i=0;i<=l1;i++)dp[i][0]=i;
		for(int i=0;i<=l2;i++)dp[0][i]=i;
		for(int i=1;i<=l1;i++){
			for(int j=1;j<=l2;j++){
				dp[i][j]=min(dp[i-1][j],dp[i][j-1])+1;
				if(word1.charAt(i-1)==word2.charAt(j-1))dp[i][j]=min(dp[i][j],dp[i-1][j-1]);
				else
					dp[i][j]=min(dp[i][j],dp[i-1][j-1]+1);
			}
		}
		/*for(int i=0;i<=l1;i++){
			for(int j=0;j<=l2;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}*/
		return dp[l1][l2];
	}

	public int min(int a, int b) {
		return a > b ? b : a;
	}

	public int minDistance(String word1, String word2, int l1, int l2) {
		if (l1 < 0 && l2 < 0)
			return 0;
		if (l1 < 0)
			return l2+1;
		if (l2 < 0)
			return l1+1;
		int x = minDistance(word1, word2, l1, l2 - 1) + 1;
		int y = minDistance(word1, word2, l1 - 1, l2) + 1;
		int z;
		if (word1.charAt(l1) == word2.charAt(l2))
			z = minDistance(word1, word2, l1 - 1, l2 - 1);
		else
			z = minDistance(word1, word2, l1 - 1, l2 - 1) + 1;
		return min(min(x, y), z);
	}

	public static void main(String[] args) {
        String word1="dinitrophenylhydrazine";
        String word2="acetylphenylhydrazine";
        EditDistance test=new EditDistance();
       // System.out.println(test.minDistance(word1, word2));
        System.out.println(test.minDistance("a", "a"));
	}
}
