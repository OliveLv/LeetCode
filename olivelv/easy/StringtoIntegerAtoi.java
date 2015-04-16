package olivelv.easy;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Implement atoi to convert a string to an integer.
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge,
 * please do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given
 * input specs). You are responsible to gather all the input requirements up
 * front.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月15日 下午4:46:10
 */
public class StringtoIntegerAtoi {
	public int myAtoi(String str) {
		if(str.length()==0)return 0;
		int flag=0;
		String s="";
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c==' '){
				if(flag==0)continue;
				else
					break;
			}
			if(c=='-'){
				if(flag==0)flag=-1;
				else
					return 0;
			}
			else
				if(c=='+'){
					if(flag==0)flag=1;
					else
						return 0;
				}
				else
					if(c>='0'&&c<='9'){
						if(flag==0)flag=1;
						s+=c;
					}
					else
						break;
		}
		
		if(flag==0)flag=1;
		if(s.length()==0)return 0;
		BigInteger val=new BigInteger(s);
		val=val.multiply(new BigInteger(String.valueOf(flag)));
		if(flag==1&&val.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE)))>0){
			return Integer.MAX_VALUE;
		}
		if(flag==-1&&val.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE)))<0){
			return Integer.MIN_VALUE;
		}
	        return (int)(flag*Long.parseLong(s));
	    }
	public static void main(String []args){
		StringtoIntegerAtoi test=new StringtoIntegerAtoi();
		System.out.println(test.myAtoi(" +0 1 2 3"));
	}
}
