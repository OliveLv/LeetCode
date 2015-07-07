package olivelv.easy;

/**
 * Given an integer, write a function to determine if it is a power of two.
 * PowerOfTwo.java
 * 
 * @author olivelv
 * @version time: Jul 7, 2015 8:03:13 AM
 */
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
		if(n==0)return false;
		while(n!=0){
			if(n==1)return true;
			if(n%2!=0)return false;
			n>>=1;
		}
		return true;
	}
	public static void main(String []args){
		PowerOfTwo test=new PowerOfTwo();
		System.out.println(test.isPowerOfTwo(3));
	}
}
