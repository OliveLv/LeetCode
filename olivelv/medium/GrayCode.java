package olivelv.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
00 - 0
01 - 1
11 - 3
10 - 2


Note:
 For a given n, a gray code sequence is not uniquely defined. 

For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.

 * 
 * @author olivelv
 * @version time: 2015年5月6日 下午10:48:44
 */
public class GrayCode {
	public List<Integer> grayCode(int n) {
		List<Integer>list=new ArrayList<Integer>();
		
		list.add(0);
		if(n==0)return list;
		int base=1;
		for(int i=1;i<=n;i++){
			//int base=(int)Math.pow(2, i-1);
			for(int j=base-1;j>=0;j--)
				list.add(list.get(j)+base);
			base<<=1;
		}
		for(int ele:list)System.out.println(ele);
		return list;
	}
	
	
	public static void main(String []args){
		GrayCode test=new GrayCode();
		test.grayCode(1);
	}
}
