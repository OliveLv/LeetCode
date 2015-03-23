package lvxuhong.easy;
/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * @author xuhong
 *
 */
//考虑溢出的情况
public class FactorialTrailingZeroes {
	 public int trailingZeroes(int n) {
		 int power = 1;
		    int c = 0;
		    int f = (int) (n/(Math.pow(5, power)));

		    while(f > 0){
		        c += f;
		        f = (int) (n/(Math.pow(5, ++power)));
		    }

		    return c;

	    }
	 
	 public static void main(String []args){
		 FactorialTrailingZeroes test =new FactorialTrailingZeroes();
		 System.out.println(test.trailingZeroes(1808548329));
	 }
}
