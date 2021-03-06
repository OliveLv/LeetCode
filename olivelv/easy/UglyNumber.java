/**   
 * Write a program to check whether a given number is an ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

Note that 1 is typically treated as an ugly number.
 * @Title: UglyNumber.java 
 * @author lxh  
 * @date Aug 21, 2015 11:08:37 AM  
 * 
 */
package olivelv.easy;

public class UglyNumber {
	public boolean isUgly(int num) {
		if(num==0)return false;
		while(num%2==0)num/=2;
		while(num%3==0)num/=3;
		while(num%5==0)num/=5;
		if(num==1)return true;
		return false;
	}
	public static void main(String []args){
		UglyNumber test=new UglyNumber();
		System.out.println(test.isUgly(8));
	}
}
