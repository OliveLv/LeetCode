package olivelv.medium;

import java.math.BigInteger;

/**
 * Given two numbers represented as strings, return multiplication of the
 * numbers as a string.
 * 
 * Note: The numbers can be arbitrarily large and are non-negative.
 * 
 * 
 * @author olivelv
 * @version time: 2015��4��18�� ����9:45:04
 */
public class MultiplyStrings {
	public String multiply(String num1, String num2) {
	      BigInteger x=new BigInteger(num1);
	      BigInteger y=new BigInteger(num2);
	      return (x.multiply(y)).toString();
	      
		}
}
