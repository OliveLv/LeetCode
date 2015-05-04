package olivelv.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given a list of non negative integers, arrange them such that they form the
 * largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of
 * an integer.
 * 
 * 
 * @author olivelv
 * @version time: 2015年5月4日 下午9:06:07
 */

public class LargestNumber {
	public String largestNumber(int[] nums) {
		List<String>list=new ArrayList<String>();
		int n=nums.length;
		for(int i=0;i<n;i++)list.add(String.valueOf(nums[i]));
	    Collections.sort(list,new Comparator<String>() {
            private int lcm(int a,int b){
            	return a/gcd(a,b)*b;
            }
            private int gcd(int a,int b){
            	if(b==0)return a;
            	if(a>b)return gcd(b,a%b);
            	return gcd(a,b%a);
            }
			@Override
			public int compare(String o1, String o2) {
				int n=o1.length();
				int m=o2.length();
				int s=lcm(m,n);
				String s1="";
				String s2="";
				for(int i=0;i<s/n;i++)s1+=o1;
				for(int i=0;i<s/m;i++)s2+=o2;
				return s1.compareTo(s2);
			}
		});
	    String s="";
	    for(int i=n-1;i>=0;i--){
	    	String str=list.get(i);
	    //	System.out.println(str);
	    	s+=str;
	    }
	    if(s.charAt(0)=='0')return "0";
		return s;
	}
	public static void main(String []args){
		//int []nums={3,30,34,5,9};
		int []nums={1440,7548,4240,6616,733,4712,883,8,9576};
		LargestNumber test=new LargestNumber();
		System.out.println(test.largestNumber(nums));
	}
}
