package olivelv.medium;

/**
 * Divide two integers without using multiplication, division and mod operator.
 * 
 * If it is overflow, return MAX_INT.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月20日 下午9:33:45
 */
public class DivideTwoIntegers {
	// TLE
	public int divide(int dividend, int divisor) {
		if(divisor==0)return Integer.MAX_VALUE;
		int res=0;
		int flag=1;
		if(dividend<0){
			flag*=-1;
			dividend=-dividend;
		}
		if(divisor<0){
			flag*=-1;
			divisor=-divisor;
		}
		while(true){
			if(dividend<divisor)break;
			dividend-=divisor;
			res++;
		}
		return flag*res;
	}
	public static void main(String []args){
		DivideTwoIntegers test=new DivideTwoIntegers();
		System.out.println(test.divide(-3, 1));
	}
}
