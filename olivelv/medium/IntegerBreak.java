/**   
 * @Title: IntegerBreak.java 
 * @author lxh  
 * @date May 16, 2016 9:27:55 PM  
 * 
 */
package olivelv.medium;

/**
 * // find regulation 
 // n  res
 // 6  3*3
 // 7  3*4
 // 8  3*3*2
 // 9  3*3*3
 // 10 3*3*4
 // 11 3*3*3*2
 */
import java.util.Scanner;

public class IntegerBreak {
	public static int max = 0;

	public int integerBreak(int n) {
		if (n <= 4)
			return n;
		int res = 1;
		for (int i = 3; i <= n; i += 3) {
			if (n - i == 1) {
				res *= 4;
				break;
			}
			if (n - i == 2) {
				res *= 6;
				break;
			}
			res *= 3;
		}
		return res;
	}

	public static void dfs(int n, int p) {
		if (n == 0) {

			if (max < p)
				max = p;
			return;
		}
		for (int i = n; i >= 1; i--) {
			// System.out.println(i);
			dfs(n - i, p * i);
		}
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		IntegerBreak test = new IntegerBreak();
		while (cin.hasNext()) {
			int n = cin.nextInt();
			max = 0;
			dfs(n, 1);
			int res = test.integerBreak(n);
			System.out.println(res);
		}

	}
}
