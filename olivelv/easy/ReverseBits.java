package olivelv.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Reverse bits of a given 32 bits unsigned integer.
 * 
 * For example, given input 43261596 (represented in binary as
 * 00000010100101000001111010011100), return 964176192 (represented in binary as
 * 00111001011110000010100101000000).
 * 
 * Follow up: If this function is called many times, how would you optimize it?
 * 
 * Related problem: Reverse Integer
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月11日 下午7:40:01
 */
public class ReverseBits {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
       int []digits=new int[32];
       int k=0;
       while(n!=0){
    	   digits[k++]=n&1;
    	   n>>>=1;
       }
       long s=0;
       for(int i=0;i<32;i++){
    	   s<<=1;
    	   s+=digits[i];
       }
       return (int)s;
	}
	public static void main(String []args){
		int n=43261596;
		ReverseBits test=new ReverseBits();
		System.out.println(test.reverseBits(n));
	}
}
