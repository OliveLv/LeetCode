package olivelv.easy;

/**
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * 
 * For example:
 * 
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only
 * one digit, return it.
 * 
 * Follow up: Could you do it without any loop/recursion in O(1) runtime?
 * 
 * AddDigits.java
 * 
 * @author olivelv
 * @version time: Aug 16, 2015 8:55:00 PM
 */
public class AddDigits {
	public int addDigits(int num) {
		while(num>=10){
			int s=0;
			while(num!=0){
				s+=num%10;
				num/=10;
			}
			num=s;
		}
		return num;
	}
	public static void main(String []args){
		AddDigits test=new AddDigits();
		System.out.println(test.addDigits(38));
	}
}
