package olivelv.medium;

/**
 * Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND
 * of all numbers in this range, inclusive.
 * 
 * For example, given the range [5, 7], you should return 4.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月17日 上午9:18:36
 */
public class BitwiseANDofNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
		if(m==0)return 0;
		if(m==n)return m;
//		for(int i=m+1;i<=n;i++){
//			m=m&i;
//			if(i==n)break;
//		}
		// not my solution
		int factor=1;
		while(m!=n){
			m>>=1;
		    n>>=1;
		    factor<<=1;
		}	
		return m*factor;
	}
	public static void main(String []args){
		BitwiseANDofNumbersRange test=new BitwiseANDofNumbersRange();
		System.out.println(test.rangeBitwiseAnd(5,7));
	}
}
