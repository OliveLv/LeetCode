package olivelv.medium;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月9日 下午3:43:09
 */
public class UniquePaths {
	//不理解！！！！
	public int uniquePaths(int m, int n) {
		if(n<m){
			int tmp=m;
			m=n;
			n=tmp;
		}
		long x=1;
		for(long i=1;i<m;i++){
			x=x*(n+i-1)/i;
		}
		return (int)x;
	}
	public static void main(String []args){
		UniquePaths test=new UniquePaths();
		System.out.println(test.uniquePaths(3, 3));
	}
}
