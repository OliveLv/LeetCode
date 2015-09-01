/**   
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.

For example,
123 -> "One Hundred Twenty Three"
12345 -> "Twelve Thousand Three Hundred Forty Five"
1234567 -> "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"
 * @Title: IntegerToEnglishWords.java 
 * @author lxh  
 * @date Sep 1, 2015 9:34:40 AM  
 * 
 */
package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

public class IntegerToEnglishWords {
	public String numberToWords(int num) {
		if(num==0)return "Zero";
		String[]digits={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[]decimal={"","Nine","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		String[]base={"","Thousand","Million","Billion"};
		List<Integer>list=new ArrayList<Integer>();
		while(num!=0){
			list.add(num%1000);
			num/=1000;
		}
		String str="";
		int n=list.size();
		for(int i=n-1;i>=0;i--){
			int val=list.get(i);
			if(val!=0&&i!=n-1)str+=" ";
			if(val==0)continue;
			if(val/100!=0){
				str+=digits[val/100]+" Hundred";
				if(val%100!=0)str+=" ";
			}
			val%=100;
			
			if(val<20)str+=digits[val];
			else{
				str+=decimal[val/10];
				if(val%10!=0)str+=" "+digits[val%10];
			}
			if(i!=0)str+=" ";
			str+=base[i];
			//if(i!=0)str+=" 3";
		}
		return str;
	}
	public static void main(String []args){
		//int max=Integer.MAX_VALUE;
		int max=1000000;
		IntegerToEnglishWords test=new IntegerToEnglishWords();
		System.out.println(test.numberToWords(max));
	}
}
