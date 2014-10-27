/**
 * Reverse digits of an integer. 
 * Example1: x = 123, return 321 
 * Example2: x =-123, return -321
 * 
 * @author LXH
 *
 */
public class Reverse_Integer {
	public int reverse(int x) {
		int rev=0;
		while(x!=0){
			rev=rev*10+x%10;
			x/=10;
		}
		return rev;
	}
	public static void main(String []args){
		Reverse_Integer test=new Reverse_Integer();
		System.out.println(test.reverse(123));
		System.out.println(test.reverse(-123));
		System.out.println(test.reverse(0));
	}
}
