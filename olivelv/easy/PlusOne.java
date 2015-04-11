package olivelv.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a non-negative number represented as an array of digits, plus one to
 * the number.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 * 
 * 
 * @author olivelv
 * @version time: 2015年4月11日 下午12:35:10
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
        int n=digits.length;
        List<Integer>ans=new ArrayList<Integer>();
        int tmp=1;
        for(int i=n-1;i>=0;i--){
        	tmp+=digits[i];
        	ans.add(tmp%10);
        	tmp/=10;
        }
        while(tmp!=0){
        	ans.add(tmp%10);
        	tmp/=10;
        }
        int idx=0;
        int []list=new int[ans.size()];
        for(int i=ans.size()-1;i>=0;i--)
        	list[idx++]=ans.get(i);
        for(int i=0;i<list.length;i++)
        	System.out.print(list[i]);
        return list;
	}
	public static void main(String []args){
		int []digits={9};
		PlusOne test=new PlusOne();
		test.plusOne(digits);
	}
}
